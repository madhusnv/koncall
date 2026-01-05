package p001o;

import com.google.android.gms.common.Scopes;
import java.util.List;
import org.apache.http.client.config.CookieSpecs;
import p001o.yqh;

/* loaded from: classes2.dex */
public abstract class cxc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yqh.C18467c m21965a(sw6 sw6Var, yqh.C18467c c18467c, yqh.C18466b c18466b) {
        wq3 wq3Var;
        sq8.m48649h(sw6Var, "input");
        if (!tw6.m50723f(sw6Var)) {
            return null;
        }
        boolean z = true;
        List listM21310d = cih.m21310d(h9g.f1(h9g.e1(cih.m21311e(cih.m21313g(sw6Var.m48958a())), 1), 1), 2);
        boolean z2 = !sq8.m48644c(kh3.h0(listM21310d), CookieSpecs.DEFAULT);
        String str = (String) listM21310d.get(0);
        switch (str.hashCode()) {
            case -1572100904:
                if (!str.equals("sso-session")) {
                    wq3Var = wq3.UNKNOWN;
                    break;
                } else {
                    wq3Var = wq3.SSO_SESSION;
                    break;
                }
            case -309425751:
                if (str.equals(Scopes.PROFILE)) {
                    wq3Var = wq3.PROFILE;
                    break;
                }
                break;
            case 1379209310:
                if (str.equals("services")) {
                    wq3Var = wq3.SERVICES;
                    break;
                }
                break;
            case 1544803905:
                if (!str.equals(CookieSpecs.DEFAULT)) {
                }
                break;
        }
        String str2 = (String) kh3.s0(listM21310d);
        if (str2 == null) {
            str2 = "";
        }
        if (listM21310d.size() != 1 || !sq8.m48644c(listM21310d.get(0), CookieSpecs.DEFAULT)) {
            if (listM21310d.size() != 2) {
                z = false;
            } else {
                if (!(str2.length() > 0) || !z2 || !cih.m21308b((String) listM21310d.get(1))) {
                }
            }
        }
        return new yqh.C18467c(str2, wq3Var, z2, z);
    }

    /* renamed from: b */
    public static final yqh.C18465a m21966b(sw6 sw6Var, yqh.C18467c c18467c, yqh.C18466b c18466b) {
        sq8.m48649h(sw6Var, "input");
        if (tw6.m50719b(sw6Var) && c18466b != null) {
            if (!(c18466b.m58121b().length() == 0)) {
                return new yqh.C18465a(f9g.Z0(sw6Var.m48958a()).toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final yqh.C18467c m21967c(sw6 sw6Var, yqh.C18467c c18467c, yqh.C18466b c18466b) {
        sq8.m48649h(sw6Var, "input");
        if (!tw6.m50720c(sw6Var)) {
            return null;
        }
        String string = f9g.Z0(h9g.f1(h9g.e1(cih.m21311e(cih.m21313g(sw6Var.m48958a())), 1), 1)).toString();
        return new yqh.C18467c(string, wq3.PROFILE, false, cih.m21308b(string));
    }

    /* renamed from: d */
    public static final yqh.C18466b m21968d(sw6 sw6Var, yqh.C18467c c18467c, yqh.C18466b c18466b) {
        sq8.m48649h(sw6Var, "input");
        if (!tw6.m50722e(sw6Var) || c18467c == null) {
            return null;
        }
        hwc hwcVarM21309c = cih.m21309c(sw6Var.m48958a());
        return new yqh.C18466b((String) hwcVarM21309c.m31227a(), cih.m21313g((String) hwcVarM21309c.m31228b()));
    }

    /* renamed from: e */
    public static final yqh.C18468d m21969e(sw6 sw6Var, yqh.C18467c c18467c, yqh.C18466b c18466b) {
        sq8.m48649h(sw6Var, "input");
        if (tw6.m50725h(sw6Var) && c18466b != null) {
            if (!(c18466b.m58121b().length() > 0)) {
                hwc hwcVarM21309c = cih.m21309c(sw6Var.m48958a());
                return new yqh.C18468d((String) hwcVarM21309c.m31227a(), (String) hwcVarM21309c.m31228b());
            }
        }
        return null;
    }
}
