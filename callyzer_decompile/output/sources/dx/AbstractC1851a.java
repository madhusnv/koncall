package dx;

import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4146d;
import lx.InterfaceC4564c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dx.a */
/* loaded from: classes3.dex */
public abstract class AbstractC1851a {
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5482a(w2.InterfaceC7879r r23, final java.lang.String r24, final java.lang.String r25, final boolean r26, final boolean r27, final x1.u0 r28, int r29, java.lang.String r30, final ex.InterfaceC2139c r31, k2.InterfaceC3962k r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx.AbstractC1851a.m5482a(w2.r, java.lang.String, java.lang.String, boolean, boolean, x1.u0, int, java.lang.String, ex.c, k2.k, int, int):void");
    }

    /* renamed from: b */
    public static final Class m5483b(InterfaceC4564c interfaceC4564c) {
        AbstractC4154l.m8923f(interfaceC4564c, "<this>");
        Class clsMo8903a = ((InterfaceC4146d) interfaceC4564c).mo8903a();
        AbstractC4154l.m8921d(clsMo8903a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsMo8903a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: c */
    public static final Class m5484c(InterfaceC4564c interfaceC4564c) {
        AbstractC4154l.m8923f(interfaceC4564c, "<this>");
        Class clsMo8903a = ((InterfaceC4146d) interfaceC4564c).mo8903a();
        if (clsMo8903a.isPrimitive()) {
            String name = clsMo8903a.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsMo8903a;
    }

    /* renamed from: d */
    public abstract void mo979d(int i10, int i11, byte[] bArr);
}
