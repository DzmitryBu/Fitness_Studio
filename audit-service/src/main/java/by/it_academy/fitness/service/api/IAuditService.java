package by.it_academy.fitness.service.api;
import by.it_academy.fitness.core.dto.MessageAudit;

public interface IAuditService {
    void save(MessageAudit messageAudit);
}
