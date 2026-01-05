package d6;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import c6.AbstractC0880j;
import c6.e0;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d6.g */
/* loaded from: classes.dex */
public final class C1617g {

    /* renamed from: d */
    public static int f8061d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f8062a;

    /* renamed from: b */
    public int f8063b = -1;

    /* renamed from: c */
    public int f8064c = -1;

    public C1617g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f8062a = accessibilityNodeInfo;
    }

    /* renamed from: d */
    public static String m5282d(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case NewHope.SENDB_BYTES /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: a */
    public final void m5283a(int i10) {
        this.f8062a.addAction(i10);
    }

    /* renamed from: b */
    public final void m5284b(C1613c c1613c) {
        this.f8062a.addAction((AccessibilityNodeInfo.AccessibilityAction) c1613c.f8055a);
    }

    /* renamed from: c */
    public final ArrayList m5285c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8062a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m5286e(int i10) {
        Bundle extras = this.f8062a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1617g)) {
            return false;
        }
        C1617g c1617g = (C1617g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f8062a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f8064c == c1617g.f8064c && this.f8063b == c1617g.f8063b;
    }

    /* renamed from: f */
    public final void m5287f(Rect rect) {
        this.f8062a.getBoundsInParent(rect);
    }

    /* renamed from: g */
    public final CharSequence m5288g() {
        boolean zIsEmpty = m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8062a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListM5285c = m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListM5285c2 = m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListM5285c3 = m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListM5285c4 = m5285c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i10 = 0; i10 < arrayListM5285c.size(); i10++) {
            spannableString.setSpan(new C1611a(((Integer) arrayListM5285c4.get(i10)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM5285c.get(i10)).intValue(), ((Integer) arrayListM5285c2.get(i10)).intValue(), ((Integer) arrayListM5285c3.get(i10)).intValue());
        }
        return spannableString;
    }

    /* renamed from: h */
    public final boolean m5289h() {
        return Build.VERSION.SDK_INT >= 26 ? this.f8062a.isShowingHintText() : m5286e(4);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8062a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final void m5290i(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8062a.setAvailableExtraData(arrayList);
        }
    }

    /* renamed from: j */
    public final void m5291j(int i10, boolean z6) {
        Bundle extras = this.f8062a.getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z6) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    /* renamed from: k */
    public final void m5292k(String str) {
        this.f8062a.setClassName(str);
    }

    /* renamed from: l */
    public final void m5293l(C1615e c1615e) {
        this.f8062a.setCollectionInfo(c1615e == null ? null : (AccessibilityNodeInfo.CollectionInfo) c1615e.f8059a);
    }

    /* renamed from: m */
    public final void m5294m(C1616f c1616f) {
        this.f8062a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c1616f.f8060a);
    }

    /* renamed from: n */
    public final void m5295n(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8062a.setHeading(z6);
        } else {
            m5291j(2, z6);
        }
    }

    /* renamed from: o */
    public final void m5296o(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8062a;
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* renamed from: p */
    public final void m5297p(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8062a;
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: q */
    public final void m5298q(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8062a.setScreenReaderFocusable(z6);
        } else {
            m5291j(1, z6);
        }
    }

    /* renamed from: r */
    public final void m5299r(boolean z6) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8062a.setShowingHintText(z6);
        } else {
            m5291j(4, z6);
        }
    }

    /* renamed from: s */
    public final void m5300s(CharSequence charSequence) {
        this.f8062a.setText(charSequence);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m5287f(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f8062a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            e0.m2361h(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(m5288g());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        sb2.append(i10 >= 30 ? AbstractC0880j.m2420d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; tooltipText: ");
        sb2.append(i10 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(i10 >= 33 ? AbstractC1614d.m5270f(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; fieldRequired: ");
        sb2.append(accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        sb2.append(i10 >= 34 ? e0.m2362i(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb2.append("; granularScrollingSupported: ");
        sb2.append(m5286e(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(i10 >= 33 ? AbstractC1614d.m5271g(accessibilityNodeInfo) : m5286e(8388608));
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(i10 >= 34 ? e0.m2367n(accessibilityNodeInfo) : m5286e(64));
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new C1613c(actionList.get(i11), 0, null, null, null));
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            C1613c c1613c = (C1613c) arrayList.get(i12);
            int iM5264a = c1613c.m5264a();
            Object obj = c1613c.f8055a;
            String strM5282d = m5282d(iM5264a);
            if (strM5282d.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM5282d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb2.append(strM5282d);
            if (i12 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
