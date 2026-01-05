package cv;

import cm.C0983a;
import ct.C1502a;
import ex.InterfaceC2139c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.C6361k;
import qw.a0;
import rv.C6634j;
import rv.C6636l;
import ss.C6919h;
import tr.C7210f;
import tr.C7212h;
import ws.C8172m;
import yr.C8742a;
import yr.C8743b;
import yr.C8745d;
import yr.C8752k;
import yr.C8753l;
import yr.C8754m;
import yr.C8755n;
import yr.i0;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1516l implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f7651a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f7652b;

    public /* synthetic */ C1516l(int i10, InterfaceC2139c interfaceC2139c) {
        this.f7651a = i10;
        this.f7652b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String str;
        switch (this.f7651a) {
            case 0:
                String selectStr = (String) obj;
                AbstractC4154l.m8923f(selectStr, "selectStr");
                this.f7652b.invoke(selectStr);
                break;
            case 1:
                C9008h it = (C9008h) obj;
                AbstractC4154l.m8923f(it, "it");
                this.f7652b.invoke(it);
                break;
            case 2:
                String it2 = (String) obj;
                AbstractC4154l.m8923f(it2, "it");
                this.f7652b.invoke(it2);
                break;
            case 3:
                String it3 = (String) obj;
                AbstractC4154l.m8923f(it3, "it");
                this.f7652b.invoke(it3);
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f7652b.invoke(bool);
                break;
            case 5:
                String it4 = (String) obj;
                AbstractC4154l.m8923f(it4, "it");
                this.f7652b.invoke(it4);
                break;
            case 6:
                C4381z it5 = (C4381z) obj;
                AbstractC4154l.m8923f(it5, "it");
                this.f7652b.invoke(new C6919h(it5));
                break;
            case 7:
                String it6 = (String) obj;
                AbstractC4154l.m8923f(it6, "it");
                this.f7652b.invoke(new C6636l(it6));
                break;
            case 8:
                String empCode = (String) obj;
                AbstractC4154l.m8923f(empCode, "empCode");
                if (empCode.length() <= 20) {
                    this.f7652b.invoke(new C6634j(empCode));
                }
                return a0.f30746a;
            case 9:
                String it7 = (String) obj;
                AbstractC4154l.m8923f(it7, "it");
                this.f7652b.invoke(new C7212h(it7));
                break;
            case 10:
                String it8 = (String) obj;
                AbstractC4154l.m8923f(it8, "it");
                this.f7652b.invoke(new C7212h(it8));
                break;
            case 11:
                C6361k it9 = (C6361k) obj;
                AbstractC4154l.m8923f(it9, "it");
                this.f7652b.invoke(new C7210f(it9));
                break;
            case 12:
                String searched = (String) obj;
                AbstractC4154l.m8923f(searched, "searched");
                System.out.println((Object) "searched ".concat(searched));
                this.f7652b.invoke(searched);
                break;
            case 13:
                C1502a it10 = (C1502a) obj;
                AbstractC4154l.m8923f(it10, "it");
                this.f7652b.invoke(it10);
                break;
            case 14:
                String it11 = (String) obj;
                AbstractC4154l.m8923f(it11, "it");
                this.f7652b.invoke(it11);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String it12 = (String) obj;
                AbstractC4154l.m8923f(it12, "it");
                this.f7652b.invoke(it12);
                break;
            case 16:
                String it13 = (String) obj;
                AbstractC4154l.m8923f(it13, "it");
                this.f7652b.invoke(it13);
                break;
            case 17:
                String it14 = (String) obj;
                AbstractC4154l.m8923f(it14, "it");
                this.f7652b.invoke(it14);
                break;
            case 18:
                String it15 = (String) obj;
                AbstractC4154l.m8923f(it15, "it");
                this.f7652b.invoke(new C8172m("hour", it15));
                break;
            case 19:
                String it16 = (String) obj;
                AbstractC4154l.m8923f(it16, "it");
                this.f7652b.invoke(new C8172m("min", it16));
                break;
            case 20:
                String it17 = (String) obj;
                AbstractC4154l.m8923f(it17, "it");
                this.f7652b.invoke(new C8172m("sec", it17));
                break;
            case 21:
                Map permissionResults = (Map) obj;
                AbstractC4154l.m8923f(permissionResults, "permissionResults");
                Collection collectionValues = permissionResults.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    str = "contact_access_permission";
                    this.f7652b.invoke(str);
                } else {
                    Iterator it18 = collectionValues.iterator();
                    while (it18.hasNext()) {
                        if (!((Boolean) it18.next()).booleanValue()) {
                            str = "permission_not_granted";
                            this.f7652b.invoke(str);
                            break;
                        }
                    }
                    str = "contact_access_permission";
                    this.f7652b.invoke(str);
                }
                break;
            case 22:
                String it19 = (String) obj;
                AbstractC4154l.m8923f(it19, "it");
                this.f7652b.invoke(new C8753l(it19));
                break;
            case 23:
                String it20 = (String) obj;
                AbstractC4154l.m8923f(it20, "it");
                this.f7652b.invoke(new C8754m(it20));
                break;
            case 24:
                String phoneNumber = (String) obj;
                AbstractC4154l.m8923f(phoneNumber, "phoneNumber");
                if (phoneNumber.length() <= 16) {
                    this.f7652b.invoke(new C8755n(phoneNumber));
                }
                return a0.f30746a;
            case 25:
                C0983a countryData = (C0983a) obj;
                AbstractC4154l.m8923f(countryData, "countryData");
                this.f7652b.invoke(new C8752k(countryData));
                break;
            case 26:
                String phoneNumber2 = (String) obj;
                AbstractC4154l.m8923f(phoneNumber2, "phoneNumber");
                if (phoneNumber2.length() <= 16) {
                    this.f7652b.invoke(new C8743b(phoneNumber2));
                }
                return a0.f30746a;
            case 27:
                C0983a countryData2 = (C0983a) obj;
                AbstractC4154l.m8923f(countryData2, "countryData");
                this.f7652b.invoke(new C8742a(countryData2));
                break;
            case 28:
                this.f7652b.invoke(new C8745d(((Boolean) obj).booleanValue()));
                break;
            default:
                String it21 = (String) obj;
                AbstractC4154l.m8923f(it21, "it");
                this.f7652b.invoke(new i0(it21));
                break;
        }
        return a0.f30746a;
    }
}
