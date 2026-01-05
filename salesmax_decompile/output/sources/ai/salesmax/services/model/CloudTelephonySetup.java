package ai.salesmax.services.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class CloudTelephonySetup {
    private String accountId;
    private String provider;
    private Map<String, Boolean> virtualNumbers = new HashMap();

    public CloudTelephonySetup(String str, String str2) {
        this.accountId = str;
        this.provider = str2;
    }

    public void addVirtualNumber(String str, Boolean bool) {
        this.virtualNumbers.put(str, bool);
    }

    public Collection<String> getOutboundVirtualNumbers() {
        return (Collection) this.virtualNumbers.entrySet().stream().filter(new Predicate() { // from class: o.ie3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) ((Map.Entry) obj).getValue()).booleanValue();
            }
        }).map(new Function() { // from class: o.je3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) ((Map.Entry) obj).getKey();
            }
        }).collect(Collectors.toSet());
    }

    public String getProvider() {
        return this.provider;
    }

    public Map<String, Boolean> getVirtualNumbers() {
        return this.virtualNumbers;
    }

    public Boolean hasVirtualNumber(String str) {
        return Boolean.valueOf(this.virtualNumbers.containsKey(str));
    }

    public void removeVirtualNumber(String str) {
        this.virtualNumbers.remove(str);
    }
}
