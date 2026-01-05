package d4;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g4.C2492h;
import kotlin.jvm.internal.C4156n;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4574m;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.v */
/* loaded from: classes.dex */
public abstract class AbstractC1594v {

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC4574m[] f7944a;

    static {
        C4156n c4156n = new C4156n(AbstractC1594v.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        a0.f21154a.getClass();
        f7944a = new InterfaceC4574m[]{c4156n, new C4156n(AbstractC1594v.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new C4156n(AbstractC1594v.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C4156n(AbstractC1594v.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C4156n(AbstractC1594v.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C4156n(AbstractC1594v.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C4156n(AbstractC1594v.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C4156n(AbstractC1594v.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new C4156n(AbstractC1594v.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new C4156n(AbstractC1594v.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new C4156n(AbstractC1594v.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new C4156n(AbstractC1594v.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new C4156n(AbstractC1594v.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C4156n(AbstractC1594v.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C4156n(AbstractC1594v.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C4156n(AbstractC1594v.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C4156n(AbstractC1594v.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C4156n(AbstractC1594v.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C4156n(AbstractC1594v.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new C4156n(AbstractC1594v.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C4156n(AbstractC1594v.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C4156n(AbstractC1594v.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new C4156n(AbstractC1594v.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new C4156n(AbstractC1594v.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new C4156n(AbstractC1594v.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C4156n(AbstractC1594v.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C4156n(AbstractC1594v.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};
        C1595w c1595w = AbstractC1592t.f7917a;
        C1595w c1595w2 = C1582j.f7842a;
    }

    /* renamed from: a */
    public static final C1595w m5223a(String str) {
        C1595w c1595w = new C1595w(str);
        c1595w.f7947c = true;
        return c1595w;
    }

    /* renamed from: b */
    public static final C1595w m5224b(String str, InterfaceC2141e interfaceC2141e) {
        return new C1595w(str, true, interfaceC2141e);
    }

    /* renamed from: c */
    public static void m5225c(InterfaceC1596x interfaceC1596x, InterfaceC2139c interfaceC2139c) {
        ((C1583k) interfaceC1596x).m5202q(C1582j.f7842a, new C1573a(null, interfaceC2139c));
    }

    /* renamed from: d */
    public static final void m5226d(InterfaceC1596x interfaceC1596x) {
        C1595w c1595w = AbstractC1592t.f7928l;
        InterfaceC4574m interfaceC4574m = f7944a[5];
        c1595w.m5236a(interfaceC1596x, Boolean.TRUE);
    }

    /* renamed from: e */
    public static final void m5227e(InterfaceC1596x interfaceC1596x, String str) {
        C1595w c1595w = AbstractC1592t.f7917a;
        ((C1583k) interfaceC1596x).m5202q(AbstractC1592t.f7917a, pe.m10833h(str));
    }

    /* renamed from: f */
    public static final void m5228f(InterfaceC1596x interfaceC1596x) {
        C1595w c1595w = AbstractC1592t.f7926j;
        InterfaceC4574m interfaceC4574m = f7944a[3];
        c1595w.m5236a(interfaceC1596x, new C1578f());
    }

    /* renamed from: g */
    public static final void m5229g(InterfaceC1596x interfaceC1596x, C1579g c1579g) {
        C1595w c1595w = AbstractC1592t.f7919c;
        InterfaceC4574m interfaceC4574m = f7944a[1];
        c1595w.m5236a(interfaceC1596x, c1579g);
    }

    /* renamed from: h */
    public static final void m5230h(InterfaceC1596x interfaceC1596x, int i10) {
        C1595w c1595w = AbstractC1592t.f7939w;
        InterfaceC4574m interfaceC4574m = f7944a[12];
        c1595w.m5236a(interfaceC1596x, new C1580h(i10));
    }

    /* renamed from: i */
    public static final void m5231i(InterfaceC1596x interfaceC1596x, boolean z6) {
        C1595w c1595w = AbstractC1592t.f7910G;
        InterfaceC4574m interfaceC4574m = f7944a[20];
        c1595w.m5236a(interfaceC1596x, Boolean.valueOf(z6));
    }

    /* renamed from: j */
    public static final void m5232j(InterfaceC1596x interfaceC1596x, C2492h c2492h) {
        C1595w c1595w = AbstractC1592t.f7917a;
        ((C1583k) interfaceC1596x).m5202q(AbstractC1592t.f7942z, pe.m10833h(c2492h));
    }

    /* renamed from: k */
    public static final void m5233k(InterfaceC1596x interfaceC1596x) {
        C1595w c1595w = AbstractC1592t.f7929m;
        InterfaceC4574m interfaceC4574m = f7944a[6];
        c1595w.m5236a(interfaceC1596x, Boolean.TRUE);
    }

    /* renamed from: l */
    public static final void m5234l(InterfaceC1596x interfaceC1596x, float f6) {
        C1595w c1595w = AbstractC1592t.f7934r;
        InterfaceC4574m interfaceC4574m = f7944a[9];
        c1595w.m5236a(interfaceC1596x, Float.valueOf(f6));
    }

    /* renamed from: m */
    public static final void m5235m(InterfaceC1596x interfaceC1596x, C1581i c1581i) {
        C1595w c1595w = AbstractC1592t.f7936t;
        InterfaceC4574m interfaceC4574m = f7944a[11];
        c1595w.m5236a(interfaceC1596x, c1581i);
    }
}
