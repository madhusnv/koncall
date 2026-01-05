package p001o;

import com.amplifyframework.datastore.generated.model.Address;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import type.AddressInput;

/* loaded from: classes.dex */
public abstract class vgf {
    /* renamed from: e */
    public static kt4 m52759e() {
        return (kt4) uni.YB().map(new Function() { // from class: o.tgf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vgf.m52760f((ryh) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.ugf
            @Override // java.util.function.Supplier
            public final Object get() {
                return vgf.m52761g();
            }
        });
    }

    /* renamed from: f */
    public static /* synthetic */ kt4 m52760f(ryh ryhVar) {
        return kt4.m36202c((String) ryhVar.f44265a, (String) ryhVar.f44266b);
    }

    /* renamed from: g */
    public static /* synthetic */ kt4 m52761g() {
        return kt4.m36202c("DummyAccount", "DummyUser");
    }

    /* renamed from: h */
    public static /* synthetic */ g0i m52762h(ryh ryhVar) {
        return g0i.m27854h((String) ryhVar.f44265a, (String) ryhVar.f44266b);
    }

    /* renamed from: i */
    public static /* synthetic */ g0i m52763i() {
        return g0i.m27854h("DummyAccount", "DummyUser");
    }

    /* renamed from: j */
    public static AddressInput m52764j(Address address) {
        return AddressInput.builder().zipcode(address.getZipcode()).state(address.getState()).region(address.getRegion()).lng(address.getLng()).lat(address.getLat()).landmark(address.getLandmark()).googlePlaceId(address.getGooglePlaceId()).streetAddress(address.getStreetAddress()).rawAddressText(address.getRawAddressText()).isPrimaryAddress(address.getIsPrimaryAddress()).establishmentName(address.getEstablishmentName()).country(address.getCountry()).area(address.getArea()).city(address.getCity()).addressType((String) Optional.ofNullable(address.getAddressType()).orElse(null)).build();
    }

    /* renamed from: k */
    public static g0i m52765k() {
        return (g0i) uni.YB().map(new Function() { // from class: o.rgf
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vgf.m52762h((ryh) obj);
            }
        }).orElseGet(new Supplier() { // from class: o.sgf
            @Override // java.util.function.Supplier
            public final Object get() {
                return vgf.m52763i();
            }
        });
    }
}
