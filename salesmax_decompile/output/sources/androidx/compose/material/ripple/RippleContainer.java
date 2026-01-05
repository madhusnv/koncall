package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p001o.eue;
import p001o.s8e;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class RippleContainer extends ViewGroup {

    /* renamed from: a */
    public final int f6219a;

    /* renamed from: b */
    public final List f6220b;

    /* renamed from: c */
    public final List f6221c;

    /* renamed from: d */
    public final eue f6222d;

    /* renamed from: e */
    public int f6223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f6219a = 5;
        ArrayList arrayList = new ArrayList();
        this.f6220b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f6221c = arrayList2;
        this.f6222d = new eue();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f6223e = 1;
        setTag(s8e.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
