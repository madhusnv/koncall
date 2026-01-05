package f2;

import android.content.Context;
import android.view.ViewGroup;
import com.websoptimization.callyzerbiz.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f2.g */
/* loaded from: classes.dex */
public final class C2184g extends ViewGroup {

    /* renamed from: a */
    public final int f10086a;

    /* renamed from: b */
    public final ArrayList f10087b;

    /* renamed from: c */
    public final ArrayList f10088c;

    /* renamed from: d */
    public final C7105p f10089d;

    /* renamed from: e */
    public int f10090e;

    public C2184g(Context context) {
        super(context);
        this.f10086a = 5;
        ArrayList arrayList = new ArrayList();
        this.f10087b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10088c = arrayList2;
        this.f10089d = new C7105p((byte) 0, 4);
        setClipChildren(false);
        C2186i c2186i = new C2186i(context);
        addView(c2186i);
        arrayList.add(c2186i);
        arrayList2.add(c2186i);
        this.f10090e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final C2186i m5883a(InterfaceC2185h interfaceC2185h) {
        C7105p c7105p = this.f10089d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c7105p.f34290b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c7105p.f34290b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) c7105p.f34291c;
        C2186i c2186i = (C2186i) linkedHashMap.get(interfaceC2185h);
        if (c2186i != null) {
            return c2186i;
        }
        ArrayList arrayList = this.f10088c;
        AbstractC4154l.m8923f(arrayList, "<this>");
        C2186i c2186i2 = (C2186i) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (c2186i2 == null) {
            int i10 = this.f10090e;
            ArrayList arrayList2 = this.f10087b;
            if (i10 > pe.m10832g(arrayList2)) {
                c2186i2 = new C2186i(getContext());
                addView(c2186i2);
                arrayList2.add(c2186i2);
            } else {
                c2186i2 = (C2186i) arrayList2.get(this.f10090e);
                InterfaceC2185h interfaceC2185h2 = (InterfaceC2185h) linkedHashMap3.get(c2186i2);
                if (interfaceC2185h2 != null) {
                    interfaceC2185h2.mo5877z();
                    C2186i c2186i3 = (C2186i) linkedHashMap2.get(interfaceC2185h2);
                    if (c2186i3 != null) {
                    }
                    linkedHashMap2.remove(interfaceC2185h2);
                    c2186i2.m5886c();
                }
            }
            int i11 = this.f10090e;
            if (i11 < this.f10086a - 1) {
                this.f10090e = i11 + 1;
            } else {
                this.f10090e = 0;
            }
        }
        linkedHashMap2.put(interfaceC2185h, c2186i2);
        linkedHashMap3.put(c2186i2, interfaceC2185h);
        return c2186i2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
