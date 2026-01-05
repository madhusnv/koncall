package androidx.compose.ui.focus;

import androidx.compose.ui.focus.C1931e;
import p001o.kf9;
import p001o.xk7;

/* renamed from: androidx.compose.ui.focus.d */
/* loaded from: classes2.dex */
public final class C1930d implements InterfaceC1929c {

    /* renamed from: a */
    public boolean f6260a = true;

    /* renamed from: b */
    public C1931e f6261b;

    /* renamed from: c */
    public C1931e f6262c;

    /* renamed from: d */
    public C1931e f6263d;

    /* renamed from: e */
    public C1931e f6264e;

    /* renamed from: f */
    public C1931e f6265f;

    /* renamed from: g */
    public C1931e f6266g;

    /* renamed from: h */
    public C1931e f6267h;

    /* renamed from: i */
    public C1931e f6268i;

    /* renamed from: j */
    public xk7 f6269j;

    /* renamed from: k */
    public xk7 f6270k;

    /* renamed from: androidx.compose.ui.focus.d$a */
    public static final class a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final a f6271a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a */
        public final C1931e m4904a(int i) {
            return C1931e.f6273b.m4910b();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m4904a(((C1928b) obj).m4884o());
        }
    }

    /* renamed from: androidx.compose.ui.focus.d$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final b f6272a = new b();

        public b() {
            super(1);
        }

        /* renamed from: a */
        public final C1931e m4905a(int i) {
            return C1931e.f6273b.m4910b();
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m4905a(((C1928b) obj).m4884o());
        }
    }

    public C1930d() {
        C1931e.a aVar = C1931e.f6273b;
        this.f6261b = aVar.m4910b();
        this.f6262c = aVar.m4910b();
        this.f6263d = aVar.m4910b();
        this.f6264e = aVar.m4910b();
        this.f6265f = aVar.m4910b();
        this.f6266g = aVar.m4910b();
        this.f6267h = aVar.m4910b();
        this.f6268i = aVar.m4910b();
        this.f6269j = a.f6271a;
        this.f6270k = b.f6272a;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: a */
    public C1931e mo4893a() {
        return this.f6265f;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: d */
    public C1931e mo4894d() {
        return this.f6266g;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: e */
    public C1931e mo4895e() {
        return this.f6263d;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: f */
    public xk7 mo4896f() {
        return this.f6270k;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: g */
    public C1931e mo4897g() {
        return this.f6268i;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    public C1931e getNext() {
        return this.f6261b;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    public C1931e getStart() {
        return this.f6267h;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: h */
    public C1931e mo4898h() {
        return this.f6264e;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: i */
    public xk7 mo4899i() {
        return this.f6269j;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: j */
    public boolean mo4900j() {
        return this.f6260a;
    }

    @Override // androidx.compose.ui.focus.InterfaceC1929c
    /* renamed from: k */
    public C1931e mo4901k() {
        return this.f6262c;
    }
}
