package by.it_academy.fitness.service;

import by.it_academy.fitness.core.dto.MessageAudit;
import by.it_academy.fitness.core.dto.User;
import by.it_academy.fitness.core.entity.AuditEntity;
import by.it_academy.fitness.repositories.IAuditDao;
import by.it_academy.fitness.service.api.IAuditService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class AuditService implements IAuditService {
    private final IAuditDao auditDao;

    public AuditService(IAuditDao auditDao) {
        this.auditDao = auditDao;
    }

    @Override
    public void save(MessageAudit messageAudit){
        AuditEntity auditEntity = new AuditEntity();
        auditEntity.setUuid(UUID.randomUUID());
        auditEntity.setDtCreate(LocalDateTime.now());
        auditEntity.setUserUUID(messageAudit.getUuid());
        auditEntity.setUserMail(messageAudit.getMail());
        auditEntity.setUserFio(messageAudit.getFio());
        auditEntity.setUserRole(messageAudit.getRole());
        auditEntity.setText(messageAudit.getText());
        auditEntity.setType(messageAudit.getType());
        auditEntity.setId(messageAudit.getId());
        auditDao.save(auditEntity);
    }
}
