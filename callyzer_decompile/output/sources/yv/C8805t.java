package yv;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.system.ErrnoException;
import android.system.OsConstants;
import aq.C0405h;
import ay.C0496f;
import ay.ExecutorC0495e;
import gs.C2726l;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import qw.C6366p;
import si.C6847c;
import sq.n2;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import xp.C8426g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yv.t */
/* loaded from: classes3.dex */
public final class C8805t {

    /* renamed from: a */
    public final Context f42474a;

    /* renamed from: b */
    public final C6366p f42475b;

    public C8805t(Context mContext) {
        AbstractC4154l.m8923f(mContext, "mContext");
        this.f42474a = mContext;
        this.f42475b = nd.m10782c(new n2(22));
    }

    /* renamed from: a */
    public static final void m16226a(C8805t c8805t, String str, Exception exc) {
        exc.printStackTrace();
        try {
            c8805t.m16238m(str, exc);
        } catch (Exception e2) {
            c8805t.m16236k(e2);
        }
        c8805t.m16230e(exc);
    }

    /* renamed from: b */
    public static final void m16227b(String str, String str2, C8805t c8805t) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(c8805t.m16229d(), true));
        C8800o c8800o = C8800o.f42459a;
        bufferedWriter.append((CharSequence) C8800o.m16190N(System.currentTimeMillis()));
        bufferedWriter.append((CharSequence) " -> ");
        bufferedWriter.append((CharSequence) str);
        bufferedWriter.append((CharSequence) " >>> ");
        bufferedWriter.append((CharSequence) str2);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    /* renamed from: c */
    public static final void m16228c(C8805t c8805t, String str) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(c8805t.m16229d(), true));
        C8800o c8800o = C8800o.f42459a;
        bufferedWriter.append((CharSequence) C8800o.m16190N(System.currentTimeMillis()));
        bufferedWriter.append((CharSequence) " >>> ");
        bufferedWriter.append((CharSequence) str);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    /* renamed from: d */
    public final File m16229d() throws IOException {
        try {
            File file = new File(this.f42474a.getExternalFilesDir(null), "LOGS.txt");
            if (!file.exists()) {
                file.createNewFile();
                return file;
            }
            if (file.length() > 52428800 && file.delete()) {
                file.createNewFile();
            }
            return file;
        } catch (Exception e2) {
            if (e2.getCause() instanceof ErrnoException) {
                m16230e(e2);
            } else {
                m16236k(e2);
            }
            return null;
        }
    }

    /* renamed from: e */
    public final void m16230e(Exception exc) {
        if (exc.getCause() instanceof ErrnoException) {
            ErrnoException errnoException = (ErrnoException) exc.getCause();
            AbstractC4154l.m8920c(errnoException);
            if (errnoException.errno == OsConstants.ENOSPC) {
                try {
                    if (Build.VERSION.SDK_INT >= 25) {
                        Intent intent = new Intent();
                        intent.setAction("android.os.storage.action.MANAGE_STORAGE");
                        this.f42474a.startActivity(intent);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: f */
    public final void m16231f(String message) {
        AbstractC4154l.m8923f(message, "message");
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C8426g(message, this, null, 9), 3);
    }

    /* renamed from: g */
    public final void m16232g(String title, String message) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(message, "message");
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0405h(message, this, title, (InterfaceC7559c) null, 28), 3);
    }

    /* renamed from: h */
    public final void m16233h(String title, String message, Throwable exception) {
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(exception, "exception");
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C2726l(this, title, message, exception, null, 4), 3);
    }

    /* renamed from: i */
    public final void m16234i(String message, Throwable exception) {
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(exception, "exception");
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C0405h(this, message, exception, (InterfaceC7559c) null, 29), 3);
    }

    /* renamed from: j */
    public final void m16235j(Throwable exception) {
        AbstractC4154l.m8923f(exception, "exception");
        C0496f c0496f = m0.f34659a;
        c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C8426g(this, exception, null, 10), 3);
    }

    /* renamed from: k */
    public final void m16236k(Exception e2) {
        AbstractC4154l.m8923f(e2, "e");
        ((C6847c) this.f42475b.getValue()).m13046c(e2);
    }

    /* renamed from: l */
    public final void m16237l(String firebaseMessage) {
        AbstractC4154l.m8923f(firebaseMessage, "firebaseMessage");
        ((C6847c) this.f42475b.getValue()).m13045b(firebaseMessage);
    }

    /* renamed from: m */
    public final void m16238m(String firebaseMessage, Exception e2) {
        AbstractC4154l.m8923f(firebaseMessage, "firebaseMessage");
        AbstractC4154l.m8923f(e2, "e");
        m16237l(firebaseMessage);
        m16236k(e2);
    }

    /* renamed from: n */
    public final void m16239n(String message, Exception exc) {
        AbstractC4154l.m8923f(message, "message");
        m16234i(message, exc);
        m16238m(message, exc);
    }

    /* renamed from: o */
    public final void m16240o(String tag, String message, Exception exception) {
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4154l.m8923f(message, "message");
        AbstractC4154l.m8923f(exception, "exception");
        m16233h(tag, message, exception);
        m16238m(message, exception);
    }
}
