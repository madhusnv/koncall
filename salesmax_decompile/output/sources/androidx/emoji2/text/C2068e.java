package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.C2066c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p001o.bc7;
import p001o.cq3;
import p001o.fgd;
import p001o.mzh;
import p001o.ub7;
import p001o.zsh;

/* renamed from: androidx.emoji2.text.e */
/* loaded from: classes2.dex */
public class C2068e extends C2066c.c {

    /* renamed from: k */
    public static final a f7309k = new a();

    /* renamed from: androidx.emoji2.text.e$a */
    public static class a {
        /* renamed from: a */
        public Typeface m6114a(Context context, bc7.C12352b c12352b) {
            return bc7.m18583a(context, null, new bc7.C12352b[]{c12352b});
        }

        /* renamed from: b */
        public bc7.C12351a m6115b(Context context, ub7 ub7Var) {
            return bc7.m18584b(context, null, ub7Var);
        }

        /* renamed from: c */
        public void m6116c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* renamed from: androidx.emoji2.text.e$b */
    public static class b implements C2066c.h {

        /* renamed from: a */
        public final Context f7310a;

        /* renamed from: b */
        public final ub7 f7311b;

        /* renamed from: c */
        public final a f7312c;

        /* renamed from: d */
        public final Object f7313d = new Object();

        /* renamed from: e */
        public Handler f7314e;

        /* renamed from: f */
        public Executor f7315f;

        /* renamed from: g */
        public ThreadPoolExecutor f7316g;

        /* renamed from: h */
        public C2066c.i f7317h;

        /* renamed from: i */
        public ContentObserver f7318i;

        /* renamed from: j */
        public Runnable f7319j;

        public b(Context context, ub7 ub7Var, a aVar) {
            fgd.m26664h(context, "Context cannot be null");
            fgd.m26664h(ub7Var, "FontRequest cannot be null");
            this.f7310a = context.getApplicationContext();
            this.f7311b = ub7Var;
            this.f7312c = aVar;
        }

        @Override // androidx.emoji2.text.C2066c.h
        /* renamed from: a */
        public void mo6044a(C2066c.i iVar) {
            fgd.m26664h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f7313d) {
                this.f7317h = iVar;
            }
            m6119d();
        }

        /* renamed from: b */
        public final void m6117b() {
            synchronized (this.f7313d) {
                this.f7317h = null;
                ContentObserver contentObserver = this.f7318i;
                if (contentObserver != null) {
                    this.f7312c.m6116c(this.f7310a, contentObserver);
                    this.f7318i = null;
                }
                Handler handler = this.f7314e;
                if (handler != null) {
                    handler.removeCallbacks(this.f7319j);
                }
                this.f7314e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f7316g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f7315f = null;
                this.f7316g = null;
            }
        }

        /* renamed from: c */
        public void m6118c() {
            synchronized (this.f7313d) {
                if (this.f7317h == null) {
                    return;
                }
                try {
                    bc7.C12352b c12352bM6120e = m6120e();
                    int iM18590b = c12352bM6120e.m18590b();
                    if (iM18590b == 2) {
                        synchronized (this.f7313d) {
                        }
                    }
                    if (iM18590b != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + iM18590b + ")");
                    }
                    try {
                        zsh.m59821a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface typefaceM6114a = this.f7312c.m6114a(this.f7310a, c12352bM6120e);
                        ByteBuffer byteBufferM39927f = mzh.m39927f(this.f7310a, null, c12352bM6120e.m18592d());
                        if (byteBufferM39927f == null || typefaceM6114a == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        C2069f c2069fM6122b = C2069f.m6122b(typefaceM6114a, byteBufferM39927f);
                        zsh.m59822b();
                        synchronized (this.f7313d) {
                            C2066c.i iVar = this.f7317h;
                            if (iVar != null) {
                                iVar.mo6047b(c2069fM6122b);
                            }
                        }
                        m6117b();
                    } catch (Throwable th) {
                        zsh.m59822b();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f7313d) {
                        C2066c.i iVar2 = this.f7317h;
                        if (iVar2 != null) {
                            iVar2.mo6046a(th2);
                        }
                        m6117b();
                    }
                }
            }
        }

        /* renamed from: d */
        public void m6119d() {
            synchronized (this.f7313d) {
                if (this.f7317h == null) {
                    return;
                }
                if (this.f7315f == null) {
                    ThreadPoolExecutor threadPoolExecutorM21579b = cq3.m21579b("emojiCompat");
                    this.f7316g = threadPoolExecutorM21579b;
                    this.f7315f = threadPoolExecutorM21579b;
                }
                this.f7315f.execute(new Runnable() { // from class: o.vb7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f50089a.m6118c();
                    }
                });
            }
        }

        /* renamed from: e */
        public final bc7.C12352b m6120e() {
            try {
                bc7.C12351a c12351aM6115b = this.f7312c.m6115b(this.f7310a, this.f7311b);
                if (c12351aM6115b.m18588c() == 0) {
                    bc7.C12352b[] c12352bArrM18587b = c12351aM6115b.m18587b();
                    if (c12352bArrM18587b == null || c12352bArrM18587b.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return c12352bArrM18587b[0];
                }
                throw new RuntimeException("fetchFonts failed (" + c12351aM6115b.m18588c() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        /* renamed from: f */
        public void m6121f(Executor executor) {
            synchronized (this.f7313d) {
                this.f7315f = executor;
            }
        }
    }

    public C2068e(Context context, ub7 ub7Var) {
        super(new b(context, ub7Var, f7309k));
    }

    /* renamed from: c */
    public C2068e m6113c(Executor executor) {
        ((b) m6088a()).m6121f(executor);
        return this;
    }
}
