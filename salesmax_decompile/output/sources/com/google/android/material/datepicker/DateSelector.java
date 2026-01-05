package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.datepicker.DateSelector;
import java.util.Collection;
import p001o.gcc;
import p001o.xzi;

/* loaded from: classes3.dex */
public interface DateSelector<S> extends Parcelable {
    static boolean j1(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    static void k2(final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: o.uz4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                DateSelector.x1(editTextArr, view, z);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: o.vz4
            @Override // java.lang.Runnable
            public final void run() {
                xzi.m57083s(editText2, false);
            }
        }, 100L);
    }

    static /* synthetic */ void x1(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        xzi.m57078n(view, false);
    }

    String B1(Context context);

    String E0(Context context);

    Collection G1();

    int I0(Context context);

    Collection K2();

    void M1(Object obj);

    Object Q2();

    View f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, gcc gccVar);

    void i3(long j);

    int o0();

    boolean z2();
}
