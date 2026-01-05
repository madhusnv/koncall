package com.google.android.gms.internal.measurement;

import android.os.UserManager;
import androidx.compose.ui.graphics.AbstractC0260a;
import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.jvm.internal.AbstractC4154l;
import ld.C4446f;
import ld.C4448h;
import ld.InterfaceC4447g;
import uw.InterfaceC7564h;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class d4 {

    /* renamed from: a */
    public static UserManager f6110a = null;

    /* renamed from: b */
    public static volatile boolean f6111b = false;

    /* renamed from: a */
    public static final InterfaceC4447g m3227a(InterfaceC7564h interfaceC7564h) {
        InterfaceC4447g interfaceC4447g;
        AbstractC4154l.m8923f(interfaceC7564h, "<this>");
        C4448h c4448h = (C4448h) interfaceC7564h.o0(C4448h.f22180c);
        if (c4448h != null && (interfaceC4447g = c4448h.f22181b) != null) {
            return interfaceC4447g;
        }
        InterfaceC4447g.f22179a.getClass();
        return C4446f.f22178b;
    }

    /* renamed from: b */
    public static final InterfaceC7879r m3228b(InterfaceC7879r interfaceC7879r, float f6) {
        return (f6 == 1.0f && f6 == 1.0f) ? interfaceC7879r : AbstractC0260a.m715b(interfaceC7879r, f6, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, false, 131068);
    }
}
