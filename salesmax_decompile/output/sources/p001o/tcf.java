package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class tcf {

    /* renamed from: a */
    public static final tcf f46841a = new tcf();

    /* renamed from: b */
    public static final xcf f46842b = new xcf("ContentDescription", C17053a.f46867a);

    /* renamed from: c */
    public static final xcf f46843c = new xcf("StateDescription", null, 2, null);

    /* renamed from: d */
    public static final xcf f46844d = new xcf("ProgressBarRangeInfo", null, 2, null);

    /* renamed from: e */
    public static final xcf f46845e = new xcf("PaneTitle", C17057e.f46871a);

    /* renamed from: f */
    public static final xcf f46846f = new xcf("SelectableGroup", null, 2, null);

    /* renamed from: g */
    public static final xcf f46847g = new xcf("CollectionInfo", null, 2, null);

    /* renamed from: h */
    public static final xcf f46848h = new xcf("CollectionItemInfo", null, 2, null);

    /* renamed from: i */
    public static final xcf f46849i = new xcf("Heading", null, 2, null);

    /* renamed from: j */
    public static final xcf f46850j = new xcf("Disabled", null, 2, null);

    /* renamed from: k */
    public static final xcf f46851k = new xcf("LiveRegion", null, 2, null);

    /* renamed from: l */
    public static final xcf f46852l = new xcf("Focused", null, 2, null);

    /* renamed from: m */
    public static final xcf f46853m = new xcf("IsTraversalGroup", null, 2, null);

    /* renamed from: n */
    public static final xcf f46854n = new xcf("InvisibleToUser", C17054b.f46868a);

    /* renamed from: o */
    public static final xcf f46855o = new xcf("TraversalIndex", C17061i.f46875a);

    /* renamed from: p */
    public static final xcf f46856p = new xcf("HorizontalScrollAxisRange", null, 2, null);

    /* renamed from: q */
    public static final xcf f46857q = new xcf("VerticalScrollAxisRange", null, 2, null);

    /* renamed from: r */
    public static final xcf f46858r = new xcf("IsPopup", C17056d.f46870a);

    /* renamed from: s */
    public static final xcf f46859s = new xcf("IsDialog", C17055c.f46869a);

    /* renamed from: t */
    public static final xcf f46860t = new xcf("Role", C17058f.f46872a);

    /* renamed from: u */
    public static final xcf f46861u = new xcf("TestTag", C17059g.f46873a);

    /* renamed from: v */
    public static final xcf f46862v = new xcf("Text", C17060h.f46874a);

    /* renamed from: w */
    public static final xcf f46863w = new xcf("EditableText", null, 2, null);

    /* renamed from: x */
    public static final xcf f46864x = new xcf("TextSelectionRange", null, 2, null);

    /* renamed from: y */
    public static final xcf f46865y = new xcf("ImeAction", null, 2, null);

    /* renamed from: z */
    public static final xcf f46866z = new xcf("Selected", null, 2, null);

    /* renamed from: A */
    public static final xcf f46837A = new xcf("ToggleableState", null, 2, null);

    /* renamed from: B */
    public static final xcf f46838B = new xcf("Password", null, 2, null);

    /* renamed from: C */
    public static final xcf f46839C = new xcf("Error", null, 2, null);

    /* renamed from: D */
    public static final xcf f46840D = new xcf("IndexForKey", null, 2, null);

    /* renamed from: o.tcf$a */
    public static final class C17053a extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17053a f46867a = new C17053a();

        public C17053a() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listT0;
            sq8.m48649h(list2, "childValue");
            if (list == null || (listT0 = kh3.T0(list)) == null) {
                return list2;
            }
            listT0.addAll(list2);
            return listT0;
        }
    }

    /* renamed from: o.tcf$b */
    public static final class C17054b extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17054b f46868a = new C17054b();

        public C17054b() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3i invoke(y3i y3iVar, y3i y3iVar2) {
            sq8.m48649h(y3iVar2, "<anonymous parameter 1>");
            return y3iVar;
        }
    }

    /* renamed from: o.tcf$c */
    public static final class C17055c extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17055c f46869a = new C17055c();

        public C17055c() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3i invoke(y3i y3iVar, y3i y3iVar2) {
            sq8.m48649h(y3iVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* renamed from: o.tcf$d */
    public static final class C17056d extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17056d f46870a = new C17056d();

        public C17056d() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3i invoke(y3i y3iVar, y3i y3iVar2) {
            sq8.m48649h(y3iVar2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* renamed from: o.tcf$e */
    public static final class C17057e extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17057e f46871a = new C17057e();

        public C17057e() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            sq8.m48649h(str2, "<anonymous parameter 1>");
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* renamed from: o.tcf$f */
    public static final class C17058f extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17058f f46872a = new C17058f();

        public C17058f() {
            super(2);
        }

        /* renamed from: a */
        public final hue m49745a(hue hueVar, int i) {
            return hueVar;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m49745a((hue) obj, ((hue) obj2).m31150n());
        }
    }

    /* renamed from: o.tcf$g */
    public static final class C17059g extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17059g f46873a = new C17059g();

        public C17059g() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            sq8.m48649h(str2, "<anonymous parameter 1>");
            return str;
        }
    }

    /* renamed from: o.tcf$h */
    public static final class C17060h extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17060h f46874a = new C17060h();

        public C17060h() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(List list, List list2) {
            List listT0;
            sq8.m48649h(list2, "childValue");
            if (list == null || (listT0 = kh3.T0(list)) == null) {
                return list2;
            }
            listT0.addAll(list2);
            return listT0;
        }
    }

    /* renamed from: o.tcf$i */
    public static final class C17061i extends kf9 implements nl7 {

        /* renamed from: a */
        public static final C17061i f46875a = new C17061i();

        public C17061i() {
            super(2);
        }

        /* renamed from: a */
        public final Float m49748a(Float f, float f2) {
            return f;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m49748a((Float) obj, ((Number) obj2).floatValue());
        }
    }

    /* renamed from: a */
    public final xcf m49714a() {
        return f46847g;
    }

    /* renamed from: b */
    public final xcf m49715b() {
        return f46848h;
    }

    /* renamed from: c */
    public final xcf m49716c() {
        return f46842b;
    }

    /* renamed from: d */
    public final xcf m49717d() {
        return f46850j;
    }

    /* renamed from: e */
    public final xcf m49718e() {
        return f46863w;
    }

    /* renamed from: f */
    public final xcf m49719f() {
        return f46839C;
    }

    /* renamed from: g */
    public final xcf m49720g() {
        return f46852l;
    }

    /* renamed from: h */
    public final xcf m49721h() {
        return f46849i;
    }

    /* renamed from: i */
    public final xcf m49722i() {
        return f46856p;
    }

    /* renamed from: j */
    public final xcf m49723j() {
        return f46865y;
    }

    /* renamed from: k */
    public final xcf m49724k() {
        return f46854n;
    }

    /* renamed from: l */
    public final xcf m49725l() {
        return f46853m;
    }

    /* renamed from: m */
    public final xcf m49726m() {
        return f46851k;
    }

    /* renamed from: n */
    public final xcf m49727n() {
        return f46845e;
    }

    /* renamed from: o */
    public final xcf m49728o() {
        return f46838B;
    }

    /* renamed from: p */
    public final xcf m49729p() {
        return f46844d;
    }

    /* renamed from: q */
    public final xcf m49730q() {
        return f46860t;
    }

    /* renamed from: r */
    public final xcf m49731r() {
        return f46846f;
    }

    /* renamed from: s */
    public final xcf m49732s() {
        return f46866z;
    }

    /* renamed from: t */
    public final xcf m49733t() {
        return f46843c;
    }

    /* renamed from: u */
    public final xcf m49734u() {
        return f46861u;
    }

    /* renamed from: v */
    public final xcf m49735v() {
        return f46862v;
    }

    /* renamed from: w */
    public final xcf m49736w() {
        return f46864x;
    }

    /* renamed from: x */
    public final xcf m49737x() {
        return f46837A;
    }

    /* renamed from: y */
    public final xcf m49738y() {
        return f46855o;
    }

    /* renamed from: z */
    public final xcf m49739z() {
        return f46857q;
    }
}
