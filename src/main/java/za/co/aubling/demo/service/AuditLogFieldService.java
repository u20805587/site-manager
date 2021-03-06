package za.co.aubling.demo.service;

import org.springframework.stereotype.Service;
import za.co.aubling.demo.dao.AuditLogFieldRepository;
import za.co.aubling.demo.domain.AuditLogField;
import za.co.aubling.demo.domain.*;
import za.co.aubling.demo.dto.AuditLogFieldDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AuditLogFieldService {

    private final AuditLogFieldRepository AuditLogFieldRepository;

    public AuditLogFieldService(AuditLogFieldRepository AuditLogFieldRepository) {
        this.AuditLogFieldRepository = AuditLogFieldRepository;
    }

    @Transactional
    public AuditLogField addAuditLogField(AuditLogFieldDto auditLogFieldDto) {
        AuditLogField auditLogField = AuditLogField.builder()
                .keyId(auditLogFieldDto.getKeyId())
                .modificationNo(auditLogFieldDto.getModificationNo())
                .fieldName(auditLogFieldDto.getFieldName())
                .oldValue(auditLogFieldDto.getOldValue())
                .newValue(auditLogFieldDto.getNewValue())
                .build();
        return AuditLogFieldRepository.save(auditLogField);
    }

    public AuditLogField auditField(AuditLogField auditLogField) {

        AuditLogField auditFieldLog = AuditLogField.builder()
                .keyId(auditLogField.getKeyId())
                .modificationNo(auditLogField.getModificationNo())
                .fieldName(auditLogField.getFieldName())
                .newValue(auditLogField.getNewValue())
                .oldValue(auditLogField.getOldValue())
                .build();

        return AuditLogFieldRepository.save(auditFieldLog);
    }

    public AuditLogField auditSiteProjectField(SiteProject siteProject) {

        AuditLogField auditFieldLog = AuditLogField.builder()
                .keyId("site_project~" + siteProject.getId())
                .modificationNo(1)
                .fieldName("name")
                .newValue(siteProject.getName())
                .build();

        return AuditLogFieldRepository.save(auditFieldLog);
    }

    public List<AuditLogField> getAuditLogField() {
        return AuditLogFieldRepository.findAll();
    }

    public Optional<AuditLogField> getAuditLogField(String keyId) {
        return AuditLogFieldRepository.findById(keyId);
    }

}
