package com.ksc.krds.model.krdsInstance;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CreateReadReplicaRequest extends BaseRequest<CreateReadReplicaRequest>{

    private String DBInstanceClass;

    private String AttachedVipId;

    private Integer Duration = 1;

    private DURATION_UNIT DurationUnit = DURATION_UNIT.M;

    private BILLTYPE BillType= BILLTYPE.YEAR_MONTH;

    private PRODUCTWHAT ProductWhat = PRODUCTWHAT.REGULAR;

    private List<String> AvailabilityZone = new ArrayList<String>();

    private BigInteger ProjectId;

    private String SecurityGroupId;

    public String getDBInstanceClass() {
        return DBInstanceClass;
    }

    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    public String getAttachedVipId() {
        return AttachedVipId;
    }

    public void setAttachedVipId(String attachedVipId) {
        AttachedVipId = attachedVipId;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public DURATION_UNIT getDurationUnit() {
        return DurationUnit;
    }

    public void setDurationUnit(DURATION_UNIT durationUnit) {
        DurationUnit = durationUnit;
    }

    public BILLTYPE getBillType() {
        return BillType;
    }

    public void setBillType(BILLTYPE billType) {
        BillType = billType;
    }

    public PRODUCTWHAT getProductWhat() {
        return ProductWhat;
    }

    public void setProductWhat(PRODUCTWHAT productWhat) {
        ProductWhat = productWhat;
    }

    public List<String> getAvailabilityZone() {
        return AvailabilityZone;
    }

    public void setAvailabilityZone(List<String> availabilityZone) {
        AvailabilityZone = availabilityZone;
    }

    public BigInteger getProjectId() {
        return ProjectId;
    }

    public void setProjectId(BigInteger projectId) {
        ProjectId = projectId;
    }

    public String getSecurityGroupId() {
        return SecurityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        SecurityGroupId = securityGroupId;
    }
}



enum DURATION_UNIT{
    UNKNOWN,Y,M,D,H
}

enum BILLTYPE{
    UNKNOWN(0),
    YEAR_MONTH(1),
    HOUR(2),
    PEAK(3),
    AMOUNT(4),
    DAY(5),
    TEMPUSE(6),
    HourlyInstantSettlement(87);
    private Integer code;
    BILLTYPE(Integer code){
        this.code = code;
    }
}

enum PRODUCTWHAT {
    UNKNOWN,
    REGULAR,
    TRIAL
}