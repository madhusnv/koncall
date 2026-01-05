package ai.salesmax.services.model;

import java.util.Map;
import java.util.Optional;

/* loaded from: classes.dex */
public class AWSCustomNamedApiModel {
    private Map<String, AWSCustomApiModel> apis;

    public Optional<AWSCustomApiModel> findApiByName(String str) {
        return Optional.ofNullable(this.apis.get(str));
    }

    public Map<String, AWSCustomApiModel> getApis() {
        return this.apis;
    }

    public void setApis(Map<String, AWSCustomApiModel> map) {
        this.apis = map;
    }
}
