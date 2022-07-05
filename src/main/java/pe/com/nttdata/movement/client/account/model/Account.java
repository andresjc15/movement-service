package pe.com.nttdata.movement.client.account.model;

import lombok.Data;
import pe.com.nttdata.movement.client.account.TypeAccount;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class Account {

    private long id;
    private String hexId;
    private String customerId;
    private TypeAccount typeAccount;
    private Long numberAccount;
    private BigDecimal amount;
    private List<Map<String, Object>> transactions;
    private boolean isActive;
    private Date createdAt;
    private Date updatedAt;

}