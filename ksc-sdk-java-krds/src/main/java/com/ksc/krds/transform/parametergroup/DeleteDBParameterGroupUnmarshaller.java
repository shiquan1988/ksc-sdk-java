package com.ksc.krds.transform.parametergroup;

import com.ksc.krds.model.RdsResponse;
import com.ksc.krds.model.RdsResponseConversion;
import com.ksc.transform.JsonUnmarshallerContext;
import com.ksc.transform.Unmarshaller;

public class DeleteDBParameterGroupUnmarshaller implements Unmarshaller<RdsResponse, JsonUnmarshallerContext> {

    @Override
    public RdsResponse unmarshall(JsonUnmarshallerContext in) throws Exception {
        return RdsResponseConversion.invoke(in.getJsonParser(), null);
    }

}
