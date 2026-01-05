package pg;

import android.content.Context;
import ec.C2005c;
import ec.C2011i;
import ec.InterfaceC2004b;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import og.be;
import og.ud;
import rb.C6488a;
import rw.AbstractC6663m;
import tb.AbstractC7094e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f9 {
    /* renamed from: a */
    public static final String m11627a(int i10, String str) {
        AbstractC4154l.m8923f(str, "<this>");
        return "+" + i10 + str;
    }

    /* renamed from: b */
    public static final String m11628b(Context context, int i10) {
        AbstractC4154l.m8923f(context, "context");
        String string = context.getString(i10, new Object[0]);
        AbstractC4154l.m8922e(string, "getString(...)");
        return string;
    }

    /* renamed from: c */
    public static final String m11629c(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-146416461);
        String strM10919b = og.t0.m10919b(i10, Arrays.copyOf(new Object[0], 0), c3966o);
        c3966o.m8623p(false);
        return strM10919b;
    }

    /* renamed from: d */
    public static final String m11630d(Integer num) {
        if (num.intValue() == 0) {
            return "";
        }
        return "+" + num;
    }

    /* renamed from: e */
    public static final String m11631e(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        return AbstractC5185w.m10135q(str, '\n', ' ');
    }

    /* renamed from: f */
    public static final String m11632f(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        return AbstractC5185w.m10136r(str, "+", "");
    }

    /* renamed from: g */
    public static final String m11633g(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        Pattern patternCompile = Pattern.compile("[-/.,:;_`!@#$%^&*<>?\\\\|\"']");
        AbstractC4154l.m8922e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("");
        AbstractC4154l.m8922e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* renamed from: h */
    public static C6488a m11634h(String str, List list, Boolean bool, int i10) {
        InterfaceC2004b interfaceC2004b;
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        if ((i10 & 8) != 0) {
            bool = null;
        }
        if (str == null && list == null && bool == null) {
            interfaceC2004b = C2011i.f9543a;
        } else {
            C2005c c2005cM10980f = ud.m10980f();
            if (list != null && !list.isEmpty()) {
                c2005cM10980f.mo1862b(AbstractC7094e.f34212b, AbstractC6663m.g0(list));
            }
            g9.m11665e(c2005cM10980f, false, str, bool);
            interfaceC2004b = c2005cM10980f;
        }
        return be.m10556a("aws.auth#sigv4a", interfaceC2004b);
    }

    /* renamed from: i */
    public static final String m11635i(String str) {
        AbstractC4154l.m8923f(str, "<this>");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = AbstractC4154l.m8924g(str.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                }
                length--;
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }
}
