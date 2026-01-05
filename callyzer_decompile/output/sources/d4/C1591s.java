package d4;

import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4155m;
import qw.InterfaceC6355e;
import qw.a0;
import rw.AbstractC6663m;
import x2.C8280d;
import x2.InterfaceC8290n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.s */
/* loaded from: classes.dex */
public final class C1591s extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final C1591s f7887b;

    /* renamed from: c */
    public static final C1591s f7888c;

    /* renamed from: d */
    public static final C1591s f7889d;

    /* renamed from: e */
    public static final C1591s f7890e;

    /* renamed from: f */
    public static final C1591s f7891f;

    /* renamed from: g */
    public static final C1591s f7892g;

    /* renamed from: h */
    public static final C1591s f7893h;

    /* renamed from: j */
    public static final C1591s f7894j;

    /* renamed from: k */
    public static final C1591s f7895k;

    /* renamed from: l */
    public static final C1591s f7896l;

    /* renamed from: m */
    public static final C1591s f7897m;

    /* renamed from: n */
    public static final C1591s f7898n;

    /* renamed from: p */
    public static final C1591s f7899p;

    /* renamed from: q */
    public static final C1591s f7900q;

    /* renamed from: r */
    public static final C1591s f7901r;

    /* renamed from: s */
    public static final C1591s f7902s;

    /* renamed from: a */
    public final /* synthetic */ int f7903a;

    static {
        int i10 = 2;
        f7887b = new C1591s(i10, 0);
        f7888c = new C1591s(i10, 1);
        f7889d = new C1591s(i10, 2);
        f7890e = new C1591s(i10, 3);
        f7891f = new C1591s(i10, 4);
        f7892g = new C1591s(i10, 5);
        f7893h = new C1591s(i10, 6);
        f7894j = new C1591s(i10, 7);
        f7895k = new C1591s(i10, 8);
        f7896l = new C1591s(i10, 9);
        f7897m = new C1591s(i10, 10);
        f7898n = new C1591s(i10, 11);
        f7899p = new C1591s(i10, 12);
        f7900q = new C1591s(i10, 13);
        f7901r = new C1591s(i10, 14);
        f7902s = new C1591s(i10, 15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1591s(int i10, int i11) {
        super(i10);
        this.f7903a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        InterfaceC6355e interfaceC6355e;
        switch (this.f7903a) {
            case 0:
                return (C8280d) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListD0 = AbstractC6663m.d0(list);
                arrayListD0.addAll(list2);
                return arrayListD0;
            case 2:
                return (InterfaceC8290n) obj;
            case 3:
                return (a0) obj;
            case 4:
                return (a0) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (a0) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                C1580h c1580h = (C1580h) obj;
                int i10 = ((C1580h) obj2).f7837a;
                return c1580h;
            case 10:
                return (String) obj;
            case 11:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListD02 = AbstractC6663m.d0(list3);
                arrayListD02.addAll(list4);
                return arrayListD02;
            case 12:
                Float f6 = (Float) obj;
                ((Number) obj2).floatValue();
                return f6;
            case 13:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 14:
                C1573a c1573a = (C1573a) obj;
                C1573a c1573a2 = (C1573a) obj2;
                if (c1573a == null || (str = c1573a.f7825a) == null) {
                    str = c1573a2.f7825a;
                }
                if (c1573a == null || (interfaceC6355e = c1573a.f7826b) == null) {
                    interfaceC6355e = c1573a2.f7826b;
                }
                return new C1573a(str, interfaceC6355e);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
