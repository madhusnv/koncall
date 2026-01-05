package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.C2066c;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p001o.cq3;
import p001o.lm0;
import p001o.pi8;
import p001o.te5;
import p001o.xca;
import p001o.zsh;

/* loaded from: classes2.dex */
public class EmojiCompatInitializer implements pi8 {

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    public class C2060a implements te5 {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2139h f7250a;

        public C2060a(AbstractC2139h abstractC2139h) {
            this.f7250a = abstractC2139h;
        }

        @Override // p001o.te5
        public void onResume(xca xcaVar) {
            EmojiCompatInitializer.this.m6041c();
            this.f7250a.mo6524d(this);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    public static class C2061b extends C2066c.c {
        public C2061b(Context context) {
            super(new C2062c(context));
            m6089b(1);
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    public static class C2062c implements C2066c.h {

        /* renamed from: a */
        public final Context f7252a;

        /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c$a */
        public class a extends C2066c.i {

            /* renamed from: a */
            public final /* synthetic */ C2066c.i f7253a;

            /* renamed from: b */
            public final /* synthetic */ ThreadPoolExecutor f7254b;

            public a(C2066c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f7253a = iVar;
                this.f7254b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.C2066c.i
            /* renamed from: a */
            public void mo6046a(Throwable th) {
                try {
                    this.f7253a.mo6046a(th);
                } finally {
                    this.f7254b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.C2066c.i
            /* renamed from: b */
            public void mo6047b(C2069f c2069f) {
                try {
                    this.f7253a.mo6047b(c2069f);
                } finally {
                    this.f7254b.shutdown();
                }
            }
        }

        public C2062c(Context context) {
            this.f7252a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.C2066c.h
        /* renamed from: a */
        public void mo6044a(final C2066c.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorM21579b = cq3.m21579b("EmojiCompatInitializer");
            threadPoolExecutorM21579b.execute(new Runnable() { // from class: o.k56
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31485a.m6043d(iVar, threadPoolExecutorM21579b);
                }
            });
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void m6043d(C2066c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                C2068e c2068eM6048a = AbstractC2064a.m6048a(this.f7252a);
                if (c2068eM6048a == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                c2068eM6048a.m6113c(threadPoolExecutor);
                c2068eM6048a.m6088a().mo6044a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.mo6046a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$d */
    public static class RunnableC2063d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                zsh.m59821a("EmojiCompat.EmojiCompatInitializer.run");
                if (C2066c.m6068i()) {
                    C2066c.m6064c().m6073l();
                }
            } finally {
                zsh.m59822b();
            }
        }
    }

    @Override // p001o.pi8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        C2066c.m6067h(new C2061b(context));
        m6040b(context);
        return Boolean.TRUE;
    }

    /* renamed from: b */
    public void m6040b(Context context) {
        AbstractC2139h lifecycle = ((xca) lm0.m37453e(context).m37458f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo6521a(new C2060a(lifecycle));
    }

    /* renamed from: c */
    public void m6041c() {
        cq3.m21581d().postDelayed(new RunnableC2063d(), 500L);
    }

    @Override // p001o.pi8
    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
