package c6;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.websoptimization.callyzerbiz.R;
import d6.C1613c;
import d6.C1617g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.a */
/* loaded from: classes.dex */
public final class C0871a extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final C0872b f5417a;

    public C0871a(C0872b c0872b) {
        this.f5417a = c0872b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5417a.mo2335a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C8989c c8989cMo2336b = this.f5417a.mo2336b(view);
        if (c8989cMo2336b != null) {
            return (AccessibilityNodeProvider) c8989cMo2336b.f43339b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5417a.mo2337c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object objValueOf;
        Object tag2;
        Object objM2511b;
        int iKeyAt;
        C1617g c1617g = new C1617g(accessibilityNodeInfo);
        Field field = v0.f5527a;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            tag = Boolean.valueOf(q0.m2490c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i11 = 0;
        c1617g.m5298q(bool != null && bool.booleanValue());
        if (Build.VERSION.SDK_INT >= 28) {
            objValueOf = Boolean.valueOf(q0.m2489b(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            objValueOf = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) objValueOf;
        c1617g.m5295n(bool2 != null && bool2.booleanValue());
        if (i10 >= 28) {
            tag2 = q0.m2488a(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        c1617g.m5297p((CharSequence) tag2);
        if (i10 >= 30) {
            objM2511b = s0.m2511b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            objM2511b = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence = (CharSequence) objM2511b;
        if (i10 >= 30) {
            AbstractC0880j.m2428l(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f5417a.mo2338d(view, c1617g);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i10 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    if (((WeakReference) sparseArray.valueAt(i12)).get() == null) {
                        arrayList.add(Integer.valueOf(i12));
                    }
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    sparseArray.remove(((Integer) arrayList.get(i13)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i14 = 0;
                while (i14 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i14];
                    int i15 = i11;
                    while (true) {
                        if (i15 >= sparseArray2.size()) {
                            iKeyAt = C1617g.f8061d;
                            C1617g.f8061d = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i15)).get())) {
                                iKeyAt = sparseArray2.keyAt(i15);
                                break;
                            }
                            i15++;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i14]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i14];
                    Spanned spanned = (Spanned) text;
                    c1617g.m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c1617g.m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c1617g.m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c1617g.m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i14++;
                    i11 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i16 = 0; i16 < list.size(); i16++) {
            c1617g.m5284b((C1613c) list.get(i16));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5417a.mo2339e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5417a.mo2340f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        return this.f5417a.mo2341g(view, i10, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i10) {
        this.f5417a.mo2342h(view, i10);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5417a.mo2343i(view, accessibilityEvent);
    }
}
