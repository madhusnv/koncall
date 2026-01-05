package tv;

import a9.C0073l;
import android.content.Context;
import android.widget.Toast;
import com.websoptimization.callyzerbiz.R;
import d7.w0;
import io.C3328c;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import pg.f9;
import pg.o6;
import rw.C6668r;
import sv.C6953a;
import tx.c0;
import ug.C7452w;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8791f;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tv.d */
/* loaded from: classes3.dex */
public final class C7230d extends w0 {

    /* renamed from: b */
    public final Context f34570b;

    /* renamed from: c */
    public final C3328c f34571c;

    /* renamed from: d */
    public final C7452w f34572d;

    /* renamed from: e */
    public final C0073l f34573e;

    /* renamed from: f */
    public final wx.w0 f34574f;

    /* renamed from: g */
    public final C8805t f34575g;

    /* renamed from: h */
    public final C8810d f34576h;

    /* renamed from: i */
    public final m1 f34577i;

    /* renamed from: j */
    public final m1 f34578j;

    /* renamed from: k */
    public final C7806h f34579k;

    /* renamed from: l */
    public final C8203d f34580l;

    /* renamed from: m */
    public final int f34581m;

    /* renamed from: n */
    public long f34582n;

    public C7230d(Context context, C3328c c3328c, C7452w c7452w, C0073l c0073l, wx.w0 w0Var, C8805t c8805t, C8810d c8810d) {
        this.f34570b = context;
        this.f34571c = c3328c;
        this.f34572d = c7452w;
        this.f34573e = c0073l;
        this.f34574f = w0Var;
        this.f34575g = c8805t;
        this.f34576h = c8810d;
        m1 m1VarM15372c = c1.m15372c(new C6953a(C6668r.f31943a, false, "", null, true, true, false, null));
        this.f34577i = m1VarM15372c;
        this.f34578j = m1VarM15372c;
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f34579k = c7806hM11805a;
        this.f34580l = c1.m15389t(c7806hM11805a);
        this.f34581m = 2000;
        c0.m13502y(c8810d, null, null, new C7227a(this, interfaceC7559c, 0), 3);
        c0.m13502y(c8810d, null, null, new C7227a(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C7227a(this, interfaceC7559c, 2), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13455e(tv.C7230d r18, ww.AbstractC8193c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C7230d.m13455e(tv.d, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b1, code lost:
    
        if (r0.mo14775g(r2, r4) == r5) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m13456f(tv.C7230d r32, ww.AbstractC8193c r33) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv.C7230d.m13456f(tv.d, ww.c):java.lang.Object");
    }

    /* renamed from: g */
    public final void m13457g(AbstractC7236j event) {
        Object value;
        Object value2;
        C6953a c6953aM13205a;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C7231e;
        m1 m1Var = this.f34577i;
        Context context = this.f34570b;
        if (!z6) {
            if (event instanceof C7235i) {
                C8791f c8791f = C8791f.f42457a;
                if (C8791f.m16174g(context, "https://youtu.be/B3DtNYhuri4")) {
                    return;
                }
                Toast.makeText(context, context.getString(R.string.intent_action_error), 0).show();
                return;
            }
            if (event instanceof C7233g) {
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6953a.m13205a((C6953a) value, null, false, null, null, false, false, false, null, 127)));
                return;
            }
            boolean z10 = event instanceof C7234h;
            int i10 = 3;
            C8810d c8810d = this.f34576h;
            InterfaceC7559c interfaceC7559c = null;
            if (z10) {
                c0.m13502y(c8810d, null, null, new C7227a(this, interfaceC7559c, 4), 3);
                return;
            } else {
                if (!(event instanceof C7232f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f34582n + this.f34581m > System.currentTimeMillis()) {
                    c0.m13502y(c8810d, null, null, new C7227a(this, interfaceC7559c, i10), 3);
                } else {
                    Toast.makeText(context, context.getString(R.string.press_back_to_close_app), 0).show();
                }
                this.f34582n = System.currentTimeMillis();
                return;
            }
        }
        String input = AbstractC5178p.g0(((C7231e) event).f34583a).toString();
        Pattern patternCompile = Pattern.compile("-");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        AbstractC4154l.m8923f(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("\\s");
        AbstractC4154l.m8922e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll2, "replaceAll(...)");
        do {
            value2 = m1Var.getValue();
            C6953a c6953a = (C6953a) value2;
            if (strReplaceAll2.length() <= 11 || strReplaceAll2.length() <= c6953a.f33643c.length() + 1) {
                int length = strReplaceAll2.length();
                C7452w c7452w = this.f34572d;
                if (length > 11) {
                    String strSubstring = strReplaceAll2.substring(0, 11);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    String upperCase = strSubstring.toUpperCase(Locale.ROOT);
                    AbstractC4154l.m8922e(upperCase, "toUpperCase(...)");
                    String strSubstring2 = strReplaceAll2.substring(0, 11);
                    AbstractC4154l.m8922e(strSubstring2, "substring(...)");
                    c7452w.getClass();
                    c6953aM13205a = C6953a.m13205a(c6953a, null, false, upperCase, C7452w.m14173i(strSubstring2).f21089b, false, false, false, null, 243);
                } else {
                    String upperCase2 = strReplaceAll2.toUpperCase(Locale.ROOT);
                    AbstractC4154l.m8922e(upperCase2, "toUpperCase(...)");
                    c7452w.getClass();
                    c6953aM13205a = C6953a.m13205a(c6953a, null, false, upperCase2, C7452w.m14173i(strReplaceAll2).f21089b, false, false, false, null, 243);
                }
            } else {
                c6953aM13205a = C6953a.m13205a(c6953a, null, false, null, null, false, false, false, f9.m11628b(context, R.string.company_code_should_be_11_characters), 119);
            }
        } while (!m1Var.m15397i(value2, c6953aM13205a));
    }
}
