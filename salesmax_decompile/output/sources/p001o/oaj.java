package p001o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes2.dex */
public final class oaj {

    /* renamed from: a */
    public final C15749e f38017a;

    /* renamed from: o.oaj$a */
    public static class C15745a extends C15749e {

        /* renamed from: a */
        public final Window f38018a;

        /* renamed from: b */
        public final yyf f38019b;

        public C15745a(Window window, yyf yyfVar) {
            this.f38018a = window;
            this.f38019b = yyfVar;
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: a */
        public void mo41892a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m41895g(i2);
                }
            }
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: e */
        public void mo41893e(int i) {
            if (i == 0) {
                m41899k(6144);
                return;
            }
            if (i == 1) {
                m41899k(4096);
                m41896h(2048);
            } else {
                if (i != 2) {
                    return;
                }
                m41899k(2048);
                m41896h(4096);
            }
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: f */
        public void mo41894f(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m41898j(i2);
                }
            }
        }

        /* renamed from: g */
        public final void m41895g(int i) {
            if (i == 1) {
                m41896h(4);
            } else if (i == 2) {
                m41896h(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f38019b.m58529a();
            }
        }

        /* renamed from: h */
        public void m41896h(int i) {
            View decorView = this.f38018a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: i */
        public void m41897i(int i) {
            this.f38018a.addFlags(i);
        }

        /* renamed from: j */
        public final void m41898j(int i) {
            if (i == 1) {
                m41899k(4);
                m41900l(1024);
            } else if (i == 2) {
                m41899k(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.f38019b.m58530b();
            }
        }

        /* renamed from: k */
        public void m41899k(int i) {
            View decorView = this.f38018a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: l */
        public void m41900l(int i) {
            this.f38018a.clearFlags(i);
        }
    }

    /* renamed from: o.oaj$b */
    public static class C15746b extends C15745a {
        public C15746b(Window window, yyf yyfVar) {
            super(window, yyfVar);
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: b */
        public boolean mo41901b() {
            return (this.f38018a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: d */
        public void mo41902d(boolean z) {
            if (!z) {
                m41899k(8192);
                return;
            }
            m41900l(67108864);
            m41897i(Integer.MIN_VALUE);
            m41896h(8192);
        }
    }

    /* renamed from: o.oaj$c */
    public static class C15747c extends C15746b {
        public C15747c(Window window, yyf yyfVar) {
            super(window, yyfVar);
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: c */
        public void mo41903c(boolean z) {
            if (!z) {
                m41899k(16);
                return;
            }
            m41900l(134217728);
            m41897i(Integer.MIN_VALUE);
            m41896h(16);
        }
    }

    /* renamed from: o.oaj$e */
    public static class C15749e {
        /* renamed from: a */
        public abstract void mo41892a(int i);

        /* renamed from: b */
        public abstract boolean mo41901b();

        /* renamed from: c */
        public void mo41903c(boolean z) {
        }

        /* renamed from: d */
        public abstract void mo41902d(boolean z);

        /* renamed from: e */
        public abstract void mo41893e(int i);

        /* renamed from: f */
        public abstract void mo41894f(int i);
    }

    public oaj(WindowInsetsController windowInsetsController) {
        this.f38017a = new C15748d(windowInsetsController, this, new yyf(windowInsetsController));
    }

    /* renamed from: g */
    public static oaj m41885g(WindowInsetsController windowInsetsController) {
        return new oaj(windowInsetsController);
    }

    /* renamed from: a */
    public void m41886a(int i) {
        this.f38017a.mo41892a(i);
    }

    /* renamed from: b */
    public boolean m41887b() {
        return this.f38017a.mo41901b();
    }

    /* renamed from: c */
    public void m41888c(boolean z) {
        this.f38017a.mo41903c(z);
    }

    /* renamed from: d */
    public void m41889d(boolean z) {
        this.f38017a.mo41902d(z);
    }

    /* renamed from: e */
    public void m41890e(int i) {
        this.f38017a.mo41893e(i);
    }

    /* renamed from: f */
    public void m41891f(int i) {
        this.f38017a.mo41894f(i);
    }

    /* renamed from: o.oaj$d */
    public static class C15748d extends C15749e {

        /* renamed from: a */
        public final oaj f38020a;

        /* renamed from: b */
        public final WindowInsetsController f38021b;

        /* renamed from: c */
        public final yyf f38022c;

        /* renamed from: d */
        public final ktf f38023d;

        /* renamed from: e */
        public Window f38024e;

        public C15748d(Window window, oaj oajVar, yyf yyfVar) {
            this(window.getInsetsController(), oajVar, yyfVar);
            this.f38024e = window;
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: a */
        public void mo41892a(int i) {
            if ((i & 8) != 0) {
                this.f38022c.m58529a();
            }
            this.f38021b.hide(i & (-9));
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: b */
        public boolean mo41901b() {
            this.f38021b.setSystemBarsAppearance(0, 0);
            return (this.f38021b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: c */
        public void mo41903c(boolean z) {
            if (z) {
                if (this.f38024e != null) {
                    m41904g(16);
                }
                this.f38021b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f38024e != null) {
                    m41905h(16);
                }
                this.f38021b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: d */
        public void mo41902d(boolean z) {
            if (z) {
                if (this.f38024e != null) {
                    m41904g(8192);
                }
                this.f38021b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f38024e != null) {
                    m41905h(8192);
                }
                this.f38021b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: e */
        public void mo41893e(int i) {
            this.f38021b.setSystemBarsBehavior(i);
        }

        @Override // p001o.oaj.C15749e
        /* renamed from: f */
        public void mo41894f(int i) {
            if ((i & 8) != 0) {
                this.f38022c.m58530b();
            }
            this.f38021b.show(i & (-9));
        }

        /* renamed from: g */
        public void m41904g(int i) {
            View decorView = this.f38024e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: h */
        public void m41905h(int i) {
            View decorView = this.f38024e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public C15748d(WindowInsetsController windowInsetsController, oaj oajVar, yyf yyfVar) {
            this.f38023d = new ktf();
            this.f38021b = windowInsetsController;
            this.f38020a = oajVar;
            this.f38022c = yyfVar;
        }
    }

    public oaj(Window window, View view) {
        yyf yyfVar = new yyf(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f38017a = new C15748d(window, this, yyfVar);
        } else if (i >= 26) {
            this.f38017a = new C15747c(window, yyfVar);
        } else {
            this.f38017a = new C15746b(window, yyfVar);
        }
    }
}
