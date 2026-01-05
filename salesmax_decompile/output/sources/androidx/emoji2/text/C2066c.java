package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001o.ap0;
import p001o.fgd;
import p001o.n56;
import p001o.nzh;
import p001o.ozh;
import p001o.r56;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes2.dex */
public class C2066c {

    /* renamed from: o */
    public static final Object f7259o = new Object();

    /* renamed from: p */
    public static final Object f7260p = new Object();

    /* renamed from: q */
    public static volatile C2066c f7261q;

    /* renamed from: b */
    public final Set f7263b;

    /* renamed from: e */
    public final b f7266e;

    /* renamed from: f */
    public final h f7267f;

    /* renamed from: g */
    public final j f7268g;

    /* renamed from: h */
    public final boolean f7269h;

    /* renamed from: i */
    public final boolean f7270i;

    /* renamed from: j */
    public final int[] f7271j;

    /* renamed from: k */
    public final boolean f7272k;

    /* renamed from: l */
    public final int f7273l;

    /* renamed from: m */
    public final int f7274m;

    /* renamed from: n */
    public final e f7275n;

    /* renamed from: a */
    public final ReadWriteLock f7262a = new ReentrantReadWriteLock();

    /* renamed from: c */
    public volatile int f7264c = 3;

    /* renamed from: d */
    public final Handler f7265d = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.emoji2.text.c$a */
    public static final class a extends b {

        /* renamed from: b */
        public volatile C2067d f7276b;

        /* renamed from: c */
        public volatile C2069f f7277c;

        /* renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C19558a extends i {
            public C19558a() {
            }

            @Override // androidx.emoji2.text.C2066c.i
            /* renamed from: a */
            public void mo6046a(Throwable th) {
                a.this.f7279a.m6075n(th);
            }

            @Override // androidx.emoji2.text.C2066c.i
            /* renamed from: b */
            public void mo6047b(C2069f c2069f) {
                a.this.m6087d(c2069f);
            }
        }

        public a(C2066c c2066c) {
            super(c2066c);
        }

        @Override // androidx.emoji2.text.C2066c.b
        /* renamed from: a */
        public void mo6084a() {
            try {
                this.f7279a.f7267f.mo6044a(new C19558a());
            } catch (Throwable th) {
                this.f7279a.m6075n(th);
            }
        }

        @Override // androidx.emoji2.text.C2066c.b
        /* renamed from: b */
        public CharSequence mo6085b(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f7276b.m6098h(charSequence, i, i2, i3, z);
        }

        @Override // androidx.emoji2.text.C2066c.b
        /* renamed from: c */
        public void mo6086c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f7277c.m6126e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f7279a.f7269h);
        }

        /* renamed from: d */
        public void m6087d(C2069f c2069f) {
            if (c2069f == null) {
                this.f7279a.m6075n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f7277c = c2069f;
            C2069f c2069f2 = this.f7277c;
            j jVar = this.f7279a.f7268g;
            e eVar = this.f7279a.f7275n;
            C2066c c2066c = this.f7279a;
            this.f7276b = new C2067d(c2069f2, jVar, eVar, c2066c.f7270i, c2066c.f7271j, n56.m40115a());
            this.f7279a.m6076o();
        }
    }

    /* renamed from: androidx.emoji2.text.c$b */
    public static class b {

        /* renamed from: a */
        public final C2066c f7279a;

        public b(C2066c c2066c) {
            this.f7279a = c2066c;
        }

        /* renamed from: a */
        public abstract void mo6084a();

        /* renamed from: b */
        public abstract CharSequence mo6085b(CharSequence charSequence, int i, int i2, int i3, boolean z);

        /* renamed from: c */
        public abstract void mo6086c(EditorInfo editorInfo);
    }

    /* renamed from: androidx.emoji2.text.c$c */
    public static abstract class c {

        /* renamed from: a */
        public final h f7280a;

        /* renamed from: b */
        public j f7281b;

        /* renamed from: c */
        public boolean f7282c;

        /* renamed from: d */
        public boolean f7283d;

        /* renamed from: e */
        public int[] f7284e;

        /* renamed from: f */
        public Set f7285f;

        /* renamed from: g */
        public boolean f7286g;

        /* renamed from: h */
        public int f7287h = -16711936;

        /* renamed from: i */
        public int f7288i = 0;

        /* renamed from: j */
        public e f7289j = new C2065b();

        public c(h hVar) {
            fgd.m26664h(hVar, "metadataLoader cannot be null.");
            this.f7280a = hVar;
        }

        /* renamed from: a */
        public final h m6088a() {
            return this.f7280a;
        }

        /* renamed from: b */
        public c m6089b(int i) {
            this.f7288i = i;
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.c$d */
    public static class d implements j {
        @Override // androidx.emoji2.text.C2066c.j
        /* renamed from: a */
        public r56 mo6090a(nzh nzhVar) {
            return new ozh(nzhVar);
        }
    }

    /* renamed from: androidx.emoji2.text.c$e */
    public interface e {
        /* renamed from: a */
        boolean mo6061a(CharSequence charSequence, int i, int i2, int i3);
    }

    /* renamed from: androidx.emoji2.text.c$f */
    public static abstract class f {
        /* renamed from: a */
        public void mo4395a(Throwable th) {
        }

        /* renamed from: b */
        public void mo4396b() {
        }
    }

    /* renamed from: androidx.emoji2.text.c$g */
    public static class g implements Runnable {

        /* renamed from: a */
        public final List f7290a;

        /* renamed from: b */
        public final Throwable f7291b;

        /* renamed from: c */
        public final int f7292c;

        public g(f fVar, int i) {
            this(Arrays.asList((f) fgd.m26664h(fVar, "initCallback cannot be null")), i, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f7290a.size();
            int i = 0;
            if (this.f7292c != 1) {
                while (i < size) {
                    ((f) this.f7290a.get(i)).mo4395a(this.f7291b);
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) this.f7290a.get(i)).mo4396b();
                    i++;
                }
            }
        }

        public g(Collection collection, int i) {
            this(collection, i, null);
        }

        public g(Collection collection, int i, Throwable th) {
            fgd.m26664h(collection, "initCallbacks cannot be null");
            this.f7290a = new ArrayList(collection);
            this.f7292c = i;
            this.f7291b = th;
        }
    }

    /* renamed from: androidx.emoji2.text.c$h */
    public interface h {
        /* renamed from: a */
        void mo6044a(i iVar);
    }

    /* renamed from: androidx.emoji2.text.c$i */
    public static abstract class i {
        /* renamed from: a */
        public abstract void mo6046a(Throwable th);

        /* renamed from: b */
        public abstract void mo6047b(C2069f c2069f);
    }

    /* renamed from: androidx.emoji2.text.c$j */
    public interface j {
        /* renamed from: a */
        r56 mo6090a(nzh nzhVar);
    }

    public C2066c(c cVar) {
        this.f7269h = cVar.f7282c;
        this.f7270i = cVar.f7283d;
        this.f7271j = cVar.f7284e;
        this.f7272k = cVar.f7286g;
        this.f7273l = cVar.f7287h;
        this.f7267f = cVar.f7280a;
        this.f7274m = cVar.f7288i;
        this.f7275n = cVar.f7289j;
        ap0 ap0Var = new ap0();
        this.f7263b = ap0Var;
        j jVar = cVar.f7281b;
        this.f7268g = jVar == null ? new d() : jVar;
        Set set = cVar.f7285f;
        if (set != null && !set.isEmpty()) {
            ap0Var.addAll(cVar.f7285f);
        }
        this.f7266e = new a(this);
        m6074m();
    }

    /* renamed from: c */
    public static C2066c m6064c() {
        C2066c c2066c;
        synchronized (f7259o) {
            c2066c = f7261q;
            fgd.m26666j(c2066c != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return c2066c;
    }

    /* renamed from: f */
    public static boolean m6065f(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return C2067d.m6092b(inputConnection, editable, i2, i3, z);
    }

    /* renamed from: g */
    public static boolean m6066g(Editable editable, int i2, KeyEvent keyEvent) {
        return C2067d.m6093c(editable, i2, keyEvent);
    }

    /* renamed from: h */
    public static C2066c m6067h(c cVar) {
        C2066c c2066c = f7261q;
        if (c2066c == null) {
            synchronized (f7259o) {
                c2066c = f7261q;
                if (c2066c == null) {
                    c2066c = new C2066c(cVar);
                    f7261q = c2066c;
                }
            }
        }
        return c2066c;
    }

    /* renamed from: i */
    public static boolean m6068i() {
        return f7261q != null;
    }

    /* renamed from: d */
    public int m6069d() {
        return this.f7273l;
    }

    /* renamed from: e */
    public int m6070e() {
        this.f7262a.readLock().lock();
        try {
            return this.f7264c;
        } finally {
            this.f7262a.readLock().unlock();
        }
    }

    /* renamed from: j */
    public boolean m6071j() {
        return this.f7272k;
    }

    /* renamed from: k */
    public final boolean m6072k() {
        return m6070e() == 1;
    }

    /* renamed from: l */
    public void m6073l() {
        fgd.m26666j(this.f7274m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m6072k()) {
            return;
        }
        this.f7262a.writeLock().lock();
        try {
            if (this.f7264c == 0) {
                return;
            }
            this.f7264c = 0;
            this.f7262a.writeLock().unlock();
            this.f7266e.mo6084a();
        } finally {
            this.f7262a.writeLock().unlock();
        }
    }

    /* renamed from: m */
    public final void m6074m() {
        this.f7262a.writeLock().lock();
        try {
            if (this.f7274m == 0) {
                this.f7264c = 0;
            }
            this.f7262a.writeLock().unlock();
            if (m6070e() == 0) {
                this.f7266e.mo6084a();
            }
        } catch (Throwable th) {
            this.f7262a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: n */
    public void m6075n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f7262a.writeLock().lock();
        try {
            this.f7264c = 2;
            arrayList.addAll(this.f7263b);
            this.f7263b.clear();
            this.f7262a.writeLock().unlock();
            this.f7265d.post(new g(arrayList, this.f7264c, th));
        } catch (Throwable th2) {
            this.f7262a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: o */
    public void m6076o() {
        ArrayList arrayList = new ArrayList();
        this.f7262a.writeLock().lock();
        try {
            this.f7264c = 1;
            arrayList.addAll(this.f7263b);
            this.f7263b.clear();
            this.f7262a.writeLock().unlock();
            this.f7265d.post(new g(arrayList, this.f7264c));
        } catch (Throwable th) {
            this.f7262a.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: p */
    public CharSequence m6077p(CharSequence charSequence) {
        return m6078q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: q */
    public CharSequence m6078q(CharSequence charSequence, int i2, int i3) {
        return m6079r(charSequence, i2, i3, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: r */
    public CharSequence m6079r(CharSequence charSequence, int i2, int i3, int i4) {
        return m6080s(charSequence, i2, i3, i4, 0);
    }

    /* renamed from: s */
    public CharSequence m6080s(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        fgd.m26666j(m6072k(), "Not initialized yet");
        fgd.m26661e(i2, "start cannot be negative");
        fgd.m26661e(i3, "end cannot be negative");
        fgd.m26661e(i4, "maxEmojiCount cannot be negative");
        fgd.m26658b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        fgd.m26658b(i2 <= charSequence.length(), "start should be < than charSequence length");
        fgd.m26658b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.f7269h : false;
        } else {
            z = true;
        }
        return this.f7266e.mo6085b(charSequence, i2, i3, i4, z);
    }

    /* renamed from: t */
    public void m6081t(f fVar) {
        fgd.m26664h(fVar, "initCallback cannot be null");
        this.f7262a.writeLock().lock();
        try {
            if (this.f7264c == 1 || this.f7264c == 2) {
                this.f7265d.post(new g(fVar, this.f7264c));
            } else {
                this.f7263b.add(fVar);
            }
        } finally {
            this.f7262a.writeLock().unlock();
        }
    }

    /* renamed from: u */
    public void m6082u(f fVar) {
        fgd.m26664h(fVar, "initCallback cannot be null");
        this.f7262a.writeLock().lock();
        try {
            this.f7263b.remove(fVar);
        } finally {
            this.f7262a.writeLock().unlock();
        }
    }

    /* renamed from: v */
    public void m6083v(EditorInfo editorInfo) {
        if (!m6072k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f7266e.mo6086c(editorInfo);
    }
}
