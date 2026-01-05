package ym;

import com.sun.mail.imap.IMAPStore;
import kk.AbstractC4092l;
import kk.InterfaceC4091k;
import kotlin.jvm.internal.AbstractC4154l;
import vm.C7724a;
import vm.EnumC7725b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ym.d */
/* loaded from: classes3.dex */
public final class C8693d implements InterfaceC4091k {

    /* renamed from: a */
    public static final C8693d f42062a = new C8693d();

    private C8693d() {
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
    @Override // kk.InterfaceC4091k
    /* renamed from: b */
    public final Object mo7644b(AbstractC4092l abstractC4092l) {
        C7724a c7724a = EnumC7725b.Companion;
        AbstractC4154l.m8920c(abstractC4092l);
        String strMo8868c = abstractC4092l.mo8868c();
        AbstractC4154l.m8922e(strMo8868c, "getAsString(...)");
        c7724a.getClass();
        switch (strMo8868c.hashCode()) {
            case -1004197030:
                if (strMo8868c.equals("textArea")) {
                    return EnumC7725b.TextArea;
                }
                break;
            case 3076014:
                if (strMo8868c.equals(IMAPStore.ID_DATE)) {
                    return EnumC7725b.Date;
                }
                break;
            case 96619420:
                if (strMo8868c.equals("email")) {
                    return EnumC7725b.Email;
                }
                break;
            case 100358090:
                if (strMo8868c.equals("input")) {
                    return EnumC7725b.Text;
                }
                break;
            case 419551681:
                if (strMo8868c.equals("onlyNumeric")) {
                    return EnumC7725b.Numeric;
                }
                break;
            case 1224335515:
                if (strMo8868c.equals("website")) {
                    return EnumC7725b.Website;
                }
                break;
        }
        return EnumC7725b.Text;
    }
}
