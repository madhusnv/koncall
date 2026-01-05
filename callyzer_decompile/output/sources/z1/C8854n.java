package z1;

import android.graphics.Rect;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b2.y0;
import c6.e0;
import e6.AbstractC1960c;
import ex.InterfaceC2139c;
import g4.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4366k;
import l4.C4381z;
import n4.C4952a;
import n4.C4953b;
import o6.b0;
import og.nd;
import qw.EnumC6359i;
import rw.AbstractC6664n;
import v0.C7622f;
import w3.t2;
import x1.v0;
import y1.AbstractC8530b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.n */
/* loaded from: classes.dex */
public final class C8854n {

    /* renamed from: a */
    public final View f42608a;

    /* renamed from: b */
    public final C8849i f42609b;

    /* renamed from: e */
    public v0 f42612e;

    /* renamed from: f */
    public y0 f42613f;

    /* renamed from: g */
    public t2 f42614g;

    /* renamed from: l */
    public Rect f42619l;

    /* renamed from: m */
    public final C8851k f42620m;

    /* renamed from: c */
    public AbstractC4155m f42610c = C8841a.f42557c;

    /* renamed from: d */
    public InterfaceC2139c f42611d = C8841a.f42558d;

    /* renamed from: h */
    public C4381z f42615h = new C4381z("", 4, n0.f13684b);

    /* renamed from: i */
    public C4366k f42616i = C4366k.f21913g;

    /* renamed from: j */
    public final ArrayList f42617j = new ArrayList();

    /* renamed from: k */
    public final Object f42618k = nd.m10781b(EnumC6359i.NONE, new b0(22, this));

    public C8854n(View view, C8842b c8842b, C8849i c8849i) {
        this.f42608a = view;
        this.f42609b = c8849i;
        this.f42620m = new C8851k(c8842b, c8849i);
    }

    /* renamed from: a */
    public final InputConnectionC8855o m16329a(EditorInfo editorInfo) {
        int i10;
        int i11;
        C4381z c4381z = this.f42615h;
        String str = c4381z.f21945a.f13620b;
        long j6 = c4381z.f21946b;
        C4366k c4366k = this.f42616i;
        int i12 = c4366k.f21918e;
        int i13 = c4366k.f21917d;
        boolean z6 = c4366k.f21914a;
        if (i12 == 1) {
            i10 = z6 ? 6 : 0;
        } else if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 2) {
            i10 = 2;
        } else if (i12 == 6) {
            i10 = 5;
        } else if (i12 == 5) {
            i10 = 7;
        } else if (i12 == 3) {
            i10 = 3;
        } else if (i12 == 4) {
            i10 = 4;
        } else {
            if (i12 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i10;
        C4953b c4953b = c4366k.f21919f;
        if (AbstractC4154l.m8918a(c4953b, C4953b.f24638c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(c4953b, 10));
            Iterator it = c4953b.f24639a.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4952a) it.next()).f24637a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i13 == 1) {
            i11 = 1;
        } else if (i13 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i11 = 1;
        } else if (i13 == 3) {
            i11 = 2;
        } else if (i13 == 4) {
            i11 = 3;
        } else if (i13 == 5) {
            i11 = 17;
        } else if (i13 == 6) {
            i11 = 33;
        } else if (i13 == 7) {
            i11 = 129;
        } else if (i13 == 8) {
            i11 = 18;
        } else {
            if (i13 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i11 = 8194;
        }
        editorInfo.inputType = i11;
        if (!z6 && (i11 & 1) == 1) {
            editorInfo.inputType = 131072 | i11;
            if (c4366k.f21918e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = c4366k.f21915b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (c4366k.f21916c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i16 = n0.f13685c;
        editorInfo.initialSelStart = (int) (j6 >> 32);
        editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
        AbstractC1960c.m5709c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC8530b.f41455a || i13 == 7 || i13 == 8) {
            AbstractC1960c.m5710d(editorInfo, false);
        } else {
            AbstractC1960c.m5710d(editorInfo, true);
            e0.m2372s(editorInfo);
        }
        C8852l c8852l = AbstractC8853m.f42607a;
        InputConnectionC8855o inputConnectionC8855o = new InputConnectionC8855o(this.f42615h, new C7622f(this), this.f42616i.f21916c, this.f42612e, this.f42613f, this.f42614g);
        this.f42617j.add(new WeakReference(inputConnectionC8855o));
        return inputConnectionC8855o;
    }
}
