package an;

import kotlin.NoWhenBranchMatchedException;
import z7.AbstractC8894w;
import zm.EnumC8993c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e4 {

    /* renamed from: a */
    public final AbstractC8894w f784a;

    public e4(AbstractC8894w abstractC8894w) {
        this.f784a = abstractC8894w;
    }

    /* renamed from: a */
    public static String m443a(EnumC8993c enumC8993c) {
        switch (d4.f746a[enumC8993c.ordinal()]) {
            case 1:
                return "NOT_FOUND";
            case 2:
                return "CON_COM_FAILED";
            case 3:
                return "DEVICE_OUT_OF_SPACE";
            case 4:
                return "LARGE_SIZE";
            case 5:
                return "SPACE_GET_FAILED";
            case 6:
                return "UPLOAD_FAILED";
            case 7:
                return "SPACE_UPDATE_FAILED";
            case 8:
                return "SUCCESS";
            case 9:
                return "DELETED";
            case 10:
                return "OUT_OF_SPACE";
            case 11:
                return "UPLOAD_IN_PROGRESS";
            case 12:
                return "COMPRESS_IN_PROGRESS";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: b */
    public static EnumC8993c m444b(String str) {
        switch (str.hashCode()) {
            case -2026521607:
                if (str.equals("DELETED")) {
                    return EnumC8993c.DELETED;
                }
                break;
            case -1990365125:
                if (str.equals("UPLOAD_FAILED")) {
                    return EnumC8993c.UPLOAD_FAILED;
                }
                break;
            case -1769293111:
                if (str.equals("UPLOAD_IN_PROGRESS")) {
                    return EnumC8993c.UPLOAD_IN_PROGRESS;
                }
                break;
            case -1740077403:
                if (str.equals("LARGE_SIZE")) {
                    return EnumC8993c.LARGE_SIZE;
                }
                break;
            case -1732422438:
                if (str.equals("SPACE_UPDATE_FAILED")) {
                    return EnumC8993c.SPACE_UPDATE_FAILED;
                }
                break;
            case -1149187101:
                if (str.equals("SUCCESS")) {
                    return EnumC8993c.SUCCESS;
                }
                break;
            case 429157816:
                if (str.equals("DEVICE_OUT_OF_SPACE")) {
                    return EnumC8993c.DEVICE_OUT_OF_SPACE;
                }
                break;
            case 696523375:
                if (str.equals("OUT_OF_SPACE")) {
                    return EnumC8993c.OUT_OF_SPACE;
                }
                break;
            case 722045610:
                if (str.equals("COMPRESS_IN_PROGRESS")) {
                    return EnumC8993c.COMPRESS_IN_PROGRESS;
                }
                break;
            case 964917855:
                if (str.equals("SPACE_GET_FAILED")) {
                    return EnumC8993c.SPACE_GET_FAILED;
                }
                break;
            case 1023286998:
                if (str.equals("NOT_FOUND")) {
                    return EnumC8993c.NOT_FOUND;
                }
                break;
            case 1545887704:
                if (str.equals("CON_COM_FAILED")) {
                    return EnumC8993c.CON_COM_FAILED;
                }
                break;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }
}
