package hq;

import an.v1;
import ex.InterfaceC2139c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.iana.AEADAlgorithm;
import p7.C5835f;
import ub.C7393i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3002g implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f16187a;

    /* renamed from: b */
    public final /* synthetic */ l7.a0 f16188b;

    public /* synthetic */ C3002g(l7.a0 a0Var, int i10) {
        this.f16187a = i10;
        this.f16188b = a0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f16187a) {
            case 0:
                String screenName = (String) obj;
                AbstractC4154l.m8923f(screenName, "screenName");
                l7.a0.m9181f(this.f16188b, screenName);
                break;
            case 1:
                String it = (String) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f16188b.m9187e(new v1(it, 22), it);
                break;
            case 2:
                l7.e0 e0Var = (l7.e0) obj;
                e0Var.f22027b = true;
                e0Var.f22028c = true;
                e0Var.m9210a(this.f16188b.f21996b.m12174i().f22140g.f22763b, new C5835f(3));
                break;
            case 3:
                String route = (String) obj;
                AbstractC4154l.m8923f(route, "route");
                l7.a0.m9181f(this.f16188b, route);
                break;
            case 4:
                Map permissionsMap = (Map) obj;
                AbstractC4154l.m8923f(permissionsMap, "permissionsMap");
                Collection collectionValues = permissionsMap.values();
                boolean zIsEmpty = collectionValues.isEmpty();
                l7.a0 a0Var = this.f16188b;
                if (zIsEmpty) {
                    l7.a0.m9181f(a0Var, "permission_not_granted");
                } else {
                    Collection collection = collectionValues;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            if (!((Boolean) it2.next()).booleanValue()) {
                                l7.a0.m9181f(a0Var, "permission_not_granted");
                            }
                        }
                    }
                    l7.a0.m9181f(a0Var, "check_dcc");
                }
                return qw.a0.f30746a;
            case 5:
                String route2 = (String) obj;
                AbstractC4154l.m8923f(route2, "route");
                l7.a0.m9181f(this.f16188b, route2);
                break;
            case 6:
                String nav = (String) obj;
                AbstractC4154l.m8923f(nav, "nav");
                l7.a0.m9181f(this.f16188b, nav);
                break;
            case 7:
                String it3 = (String) obj;
                AbstractC4154l.m8923f(it3, "it");
                l7.a0.m9181f(this.f16188b, it3);
                break;
            case 8:
                l7.e0 navigate = (l7.e0) obj;
                AbstractC4154l.m8923f(navigate, "$this$navigate");
                navigate.m9210a(this.f16188b.f21996b.m12174i().f22140g.f22763b, new C7393i(23));
                navigate.f22027b = true;
                break;
            case 9:
                String it4 = (String) obj;
                AbstractC4154l.m8923f(it4, "it");
                l7.a0.m9181f(this.f16188b, it4);
                break;
            case 10:
                String navigationScreen = (String) obj;
                AbstractC4154l.m8923f(navigationScreen, "navigationScreen");
                l7.a0.m9181f(this.f16188b, navigationScreen);
                break;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l7.a0 a0Var2 = this.f16188b;
                if (zBooleanValue) {
                    l7.a0.m9181f(a0Var2, "contact_compare_result");
                } else {
                    l7.a0.m9181f(a0Var2, "add_contacts_to_compare");
                }
                return qw.a0.f30746a;
            case 12:
                String it5 = (String) obj;
                AbstractC4154l.m8923f(it5, "it");
                l7.a0.m9181f(this.f16188b, it5);
                break;
            case 13:
                String screenName2 = (String) obj;
                AbstractC4154l.m8923f(screenName2, "screenName");
                this.f16188b.m9187e(new v1(screenName2, 24), screenName2);
                break;
            case 14:
                String it6 = (String) obj;
                AbstractC4154l.m8923f(it6, "it");
                l7.a0.m9181f(this.f16188b, it6);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String route3 = (String) obj;
                AbstractC4154l.m8923f(route3, "route");
                l7.a0.m9181f(this.f16188b, route3);
                break;
            default:
                String it7 = (String) obj;
                AbstractC4154l.m8923f(it7, "it");
                l7.a0.m9181f(this.f16188b, it7);
                break;
        }
        return qw.a0.f30746a;
    }
}
