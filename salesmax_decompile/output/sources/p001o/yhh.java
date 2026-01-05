package p001o;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.C2066c;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.concurrent.Executor;
import org.objectweb.asm.Opcodes;
import p001o.df8;
import p001o.pd9;
import p001o.qd9;

/* loaded from: classes2.dex */
public abstract class yhh {
    /* renamed from: d */
    public static final Executor m57845d(final Choreographer choreographer) {
        sq8.m48649h(choreographer, "<this>");
        return new Executor() { // from class: o.whh
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                yhh.m57846e(choreographer, runnable);
            }
        };
    }

    /* renamed from: e */
    public static final void m57846e(Choreographer choreographer, final Runnable runnable) {
        sq8.m48649h(choreographer, "$this_asExecutor");
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: o.xhh
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                yhh.m57847f(runnable, j);
            }
        });
    }

    /* renamed from: f */
    public static final void m57847f(Runnable runnable, long j) {
        runnable.run();
    }

    /* renamed from: g */
    public static final boolean m57848g(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: h */
    public static final void m57849h(EditorInfo editorInfo, ef8 ef8Var, chh chhVar) {
        sq8.m48649h(editorInfo, "<this>");
        sq8.m48649h(ef8Var, "imeOptions");
        sq8.m48649h(chhVar, "textFieldValue");
        int iM24918d = ef8Var.m24918d();
        df8.C12897a c12897a = df8.f19732b;
        int i = 6;
        if (df8.m22972l(iM24918d, c12897a.m22976a())) {
            if (!ef8Var.m24920f()) {
                i = 0;
            }
        } else if (df8.m22972l(iM24918d, c12897a.m22980e())) {
            i = 1;
        } else if (df8.m22972l(iM24918d, c12897a.m22978c())) {
            i = 2;
        } else if (df8.m22972l(iM24918d, c12897a.m22979d())) {
            i = 5;
        } else if (df8.m22972l(iM24918d, c12897a.m22981f())) {
            i = 7;
        } else if (df8.m22972l(iM24918d, c12897a.m22982g())) {
            i = 3;
        } else if (df8.m22972l(iM24918d, c12897a.m22983h())) {
            i = 4;
        } else if (!df8.m22972l(iM24918d, c12897a.m22977b())) {
            throw new IllegalStateException("invalid ImeAction".toString());
        }
        editorInfo.imeOptions = i;
        int iM24919e = ef8Var.m24919e();
        qd9.C16347a c16347a = qd9.f41694a;
        if (qd9.m45176k(iM24919e, c16347a.m45186h())) {
            editorInfo.inputType = 1;
        } else if (qd9.m45176k(iM24919e, c16347a.m45179a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (qd9.m45176k(iM24919e, c16347a.m45182d())) {
            editorInfo.inputType = 2;
        } else if (qd9.m45176k(iM24919e, c16347a.m45185g())) {
            editorInfo.inputType = 3;
        } else if (qd9.m45176k(iM24919e, c16347a.m45187i())) {
            editorInfo.inputType = 17;
        } else if (qd9.m45176k(iM24919e, c16347a.m45181c())) {
            editorInfo.inputType = 33;
        } else if (qd9.m45176k(iM24919e, c16347a.m45184f())) {
            editorInfo.inputType = Opcodes.LOR;
        } else if (qd9.m45176k(iM24919e, c16347a.m45183e())) {
            editorInfo.inputType = 18;
        } else {
            if (!qd9.m45176k(iM24919e, c16347a.m45180b())) {
                throw new IllegalStateException("Invalid Keyboard Type".toString());
            }
            editorInfo.inputType = 8194;
        }
        if (!ef8Var.m24920f() && m57848g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= Opcodes.ACC_DEPRECATED;
            if (df8.m22972l(ef8Var.m24918d(), c12897a.m22976a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (m57848g(editorInfo.inputType, 1)) {
            int iM24917c = ef8Var.m24917c();
            pd9.C16072a c16072a = pd9.f39900a;
            if (pd9.m43459f(iM24917c, c16072a.m43462a())) {
                editorInfo.inputType |= 4096;
            } else if (pd9.m43459f(iM24917c, c16072a.m43465d())) {
                editorInfo.inputType |= 8192;
            } else if (pd9.m43459f(iM24917c, c16072a.m43464c())) {
                editorInfo.inputType |= Opcodes.ACC_ENUM;
            }
            if (ef8Var.m24916b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = kih.m35763j(chhVar.m21288b());
        editorInfo.initialSelEnd = kih.m35760g(chhVar.m21288b());
        i46.m31489f(editorInfo, chhVar.m21289c());
        editorInfo.imeOptions |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
    }

    /* renamed from: i */
    public static final void m57850i(EditorInfo editorInfo) {
        if (C2066c.m6068i()) {
            C2066c.m6064c().m6083v(editorInfo);
        }
    }
}
