package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10937b {
    /* renamed from: a */
    public static void m14069a(C10936a c10936a, View view) {
        m14070b(c10936a, view, null);
    }

    /* renamed from: b */
    public static void m14070b(C10936a c10936a, View view, FrameLayout frameLayout) {
        m14074f(c10936a, view, frameLayout);
        if (c10936a.m14054l() != null) {
            c10936a.m14054l().setForeground(c10936a);
        } else {
            view.getOverlay().add(c10936a);
        }
    }

    /* renamed from: c */
    public static SparseArray m14071c(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            sparseArray.put(iKeyAt, state != null ? C10936a.m14021g(context, state) : null);
        }
        return sparseArray;
    }

    /* renamed from: d */
    public static ParcelableSparseArray m14072d(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            C10936a c10936a = (C10936a) sparseArray.valueAt(i);
            parcelableSparseArray.put(iKeyAt, c10936a != null ? c10936a.m14064v() : null);
        }
        return parcelableSparseArray;
    }

    /* renamed from: e */
    public static void m14073e(C10936a c10936a, View view) {
        if (c10936a == null) {
            return;
        }
        if (c10936a.m14054l() != null) {
            c10936a.m14054l().setForeground(null);
        } else {
            view.getOverlay().remove(c10936a);
        }
    }

    /* renamed from: f */
    public static void m14074f(C10936a c10936a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c10936a.setBounds(rect);
        c10936a.m14042V(view, frameLayout);
    }

    /* renamed from: g */
    public static void m14075g(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
