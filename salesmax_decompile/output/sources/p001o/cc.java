package p001o;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.time.Duration;
import j$.time.TimeConversions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;
import p001o.jc;

/* loaded from: classes2.dex */
public class cc {

    /* renamed from: d */
    public static int f17767d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f17768a;

    /* renamed from: b */
    public int f17769b = -1;

    /* renamed from: c */
    public int f17770c = -1;

    /* renamed from: o.cc$a */
    public static class C12624a {

        /* renamed from: A */
        public static final C12624a f17771A;

        /* renamed from: B */
        public static final C12624a f17772B;

        /* renamed from: C */
        public static final C12624a f17773C;

        /* renamed from: D */
        public static final C12624a f17774D;

        /* renamed from: E */
        public static final C12624a f17775E;

        /* renamed from: F */
        public static final C12624a f17776F;

        /* renamed from: G */
        public static final C12624a f17777G;

        /* renamed from: H */
        public static final C12624a f17778H;

        /* renamed from: I */
        public static final C12624a f17779I;

        /* renamed from: J */
        public static final C12624a f17780J;

        /* renamed from: K */
        public static final C12624a f17781K;

        /* renamed from: L */
        public static final C12624a f17782L;

        /* renamed from: M */
        public static final C12624a f17783M;

        /* renamed from: N */
        public static final C12624a f17784N;

        /* renamed from: O */
        public static final C12624a f17785O;

        /* renamed from: P */
        public static final C12624a f17786P;

        /* renamed from: Q */
        public static final C12624a f17787Q;

        /* renamed from: R */
        public static final C12624a f17788R;

        /* renamed from: S */
        public static final C12624a f17789S;

        /* renamed from: T */
        public static final C12624a f17790T;

        /* renamed from: U */
        public static final C12624a f17791U;

        /* renamed from: V */
        public static final C12624a f17792V;

        /* renamed from: e */
        public static final C12624a f17793e = new C12624a(1, null);

        /* renamed from: f */
        public static final C12624a f17794f = new C12624a(2, null);

        /* renamed from: g */
        public static final C12624a f17795g = new C12624a(4, null);

        /* renamed from: h */
        public static final C12624a f17796h = new C12624a(8, null);

        /* renamed from: i */
        public static final C12624a f17797i = new C12624a(16, null);

        /* renamed from: j */
        public static final C12624a f17798j = new C12624a(32, null);

        /* renamed from: k */
        public static final C12624a f17799k = new C12624a(64, null);

        /* renamed from: l */
        public static final C12624a f17800l = new C12624a(128, null);

        /* renamed from: m */
        public static final C12624a f17801m = new C12624a(256, (CharSequence) null, jc.C14494b.class);

        /* renamed from: n */
        public static final C12624a f17802n = new C12624a(512, (CharSequence) null, jc.C14494b.class);

        /* renamed from: o */
        public static final C12624a f17803o = new C12624a(1024, (CharSequence) null, jc.C14495c.class);

        /* renamed from: p */
        public static final C12624a f17804p = new C12624a(2048, (CharSequence) null, jc.C14495c.class);

        /* renamed from: q */
        public static final C12624a f17805q = new C12624a(4096, null);

        /* renamed from: r */
        public static final C12624a f17806r = new C12624a(8192, null);

        /* renamed from: s */
        public static final C12624a f17807s = new C12624a(Opcodes.ACC_ENUM, null);

        /* renamed from: t */
        public static final C12624a f17808t = new C12624a(32768, null);

        /* renamed from: u */
        public static final C12624a f17809u = new C12624a(65536, null);

        /* renamed from: v */
        public static final C12624a f17810v = new C12624a(Opcodes.ACC_DEPRECATED, (CharSequence) null, jc.C14499g.class);

        /* renamed from: w */
        public static final C12624a f17811w = new C12624a(262144, null);

        /* renamed from: x */
        public static final C12624a f17812x = new C12624a(Opcodes.ASM8, null);

        /* renamed from: y */
        public static final C12624a f17813y = new C12624a(1048576, null);

        /* renamed from: z */
        public static final C12624a f17814z = new C12624a(2097152, (CharSequence) null, jc.C14500h.class);

        /* renamed from: a */
        public final Object f17815a;

        /* renamed from: b */
        public final int f17816b;

        /* renamed from: c */
        public final Class f17817c;

        /* renamed from: d */
        public final jc f17818d;

        static {
            int i = Build.VERSION.SDK_INT;
            f17771A = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f17772B = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, jc.C14497e.class);
            f17773C = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f17774D = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f17775E = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f17776F = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f17777G = new C12624a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f17778H = new C12624a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f17779I = new C12624a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f17780J = new C12624a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f17781K = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f17782L = new C12624a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, jc.C14498f.class);
            f17783M = new C12624a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, jc.C14496d.class);
            f17784N = new C12624a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f17785O = new C12624a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f17786P = new C12624a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f17787Q = new C12624a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f17788R = new C12624a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f17789S = new C12624a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f17790T = new C12624a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f17791U = new C12624a(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f17792V = new C12624a(i >= 34 ? C12627d.m20818a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public C12624a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C12624a m20801a(CharSequence charSequence, jc jcVar) {
            return new C12624a(null, this.f17816b, charSequence, jcVar, this.f17817c);
        }

        /* renamed from: b */
        public int m20802b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f17815a).getId();
        }

        /* renamed from: c */
        public CharSequence m20803c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f17815a).getLabel();
        }

        /* renamed from: d */
        public boolean m20804d(View view, Bundle bundle) {
            if (this.f17818d == null) {
                return false;
            }
            Class cls = this.f17817c;
            if (cls != null) {
                try {
                    tq.m50332a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception unused) {
                    Class cls2 = this.f17817c;
                    String name = cls2 == null ? "null" : cls2.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                    sb.append(name);
                }
            }
            return this.f17818d.mo6030a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C12624a)) {
                return false;
            }
            C12624a c12624a = (C12624a) obj;
            Object obj2 = this.f17815a;
            return obj2 == null ? c12624a.f17815a == null : obj2.equals(c12624a.f17815a);
        }

        public int hashCode() {
            Object obj = this.f17815a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strM20749j = cc.m20749j(this.f17816b);
            if (strM20749j.equals("ACTION_UNKNOWN") && m20803c() != null) {
                strM20749j = m20803c().toString();
            }
            sb.append(strM20749j);
            return sb.toString();
        }

        public C12624a(int i, CharSequence charSequence, jc jcVar) {
            this(null, i, charSequence, jcVar, null);
        }

        public C12624a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public C12624a(int i, CharSequence charSequence, Class cls) {
            this(null, i, charSequence, null, cls);
        }

        public C12624a(Object obj, int i, CharSequence charSequence, jc jcVar, Class cls) {
            this.f17816b = i;
            this.f17818d = jcVar;
            if (obj == null) {
                this.f17815a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f17815a = obj;
            }
            this.f17817c = cls;
        }
    }

    /* renamed from: o.cc$b */
    public static class C12625b {
        /* renamed from: a */
        public static Object m20805a(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        /* renamed from: b */
        public static CharSequence m20806b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* renamed from: c */
        public static void m20807c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* renamed from: o.cc$c */
    public static class C12626c {
        /* renamed from: a */
        public static C12629f m20808a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new C12629f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        /* renamed from: b */
        public static cc m20809b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return cc.e1(accessibilityNodeInfo.getChild(i, i2));
        }

        /* renamed from: c */
        public static String m20810c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        /* renamed from: d */
        public static String m20811d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        /* renamed from: e */
        public static AccessibilityNodeInfo.ExtraRenderingInfo m20812e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        /* renamed from: f */
        public static cc m20813f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return cc.e1(accessibilityNodeInfo.getParent(i));
        }

        /* renamed from: g */
        public static String m20814g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* renamed from: h */
        public static boolean m20815h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        /* renamed from: i */
        public static void m20816i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        /* renamed from: j */
        public static void m20817j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* renamed from: o.cc$d */
    public static class C12627d {
        /* renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m20818a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* renamed from: b */
        public static void m20819b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* renamed from: c */
        public static CharSequence m20820c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* renamed from: d */
        public static long m20821d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()).toMillis();
        }

        /* renamed from: e */
        public static boolean m20822e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        /* renamed from: f */
        public static boolean m20823f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        /* renamed from: g */
        public static void m20824g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        /* renamed from: h */
        public static void m20825h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        /* renamed from: i */
        public static void m20826i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        /* renamed from: j */
        public static void m20827j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(Duration.ofMillis(j)));
        }

        /* renamed from: k */
        public static void m20828k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        /* renamed from: l */
        public static void m20829l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    /* renamed from: o.cc$e */
    public static class C12628e {

        /* renamed from: a */
        public final Object f17819a;

        public C12628e(Object obj) {
            this.f17819a = obj;
        }

        /* renamed from: a */
        public static C12628e m20830a(int i, int i2, boolean z) {
            return new C12628e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: b */
        public static C12628e m20831b(int i, int i2, boolean z, int i3) {
            return new C12628e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: o.cc$f */
    public static class C12629f {

        /* renamed from: a */
        public final Object f17820a;

        public C12629f(Object obj) {
            this.f17820a = obj;
        }

        /* renamed from: a */
        public static C12629f m20832a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new C12629f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* renamed from: o.cc$g */
    public static class C12630g {

        /* renamed from: a */
        public final Object f17821a;

        public C12630g(Object obj) {
            this.f17821a = obj;
        }

        /* renamed from: a */
        public static C12630g m20833a(int i, float f, float f2, float f3) {
            return new C12630g(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public cc(Object obj) {
        this.f17768a = (AccessibilityNodeInfo) obj;
    }

    public static cc a0() {
        return d1(AccessibilityNodeInfo.obtain());
    }

    public static cc b0(View view) {
        return d1(AccessibilityNodeInfo.obtain(view));
    }

    public static cc c0(cc ccVar) {
        return d1(AccessibilityNodeInfo.obtain(ccVar.f17768a));
    }

    public static cc d1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new cc(accessibilityNodeInfo);
    }

    public static cc e1(Object obj) {
        if (obj != null) {
            return new cc(obj);
        }
        return null;
    }

    /* renamed from: j */
    public static String m20749j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
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
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Opcodes.ACC_ENUM /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case Opcodes.ACC_DEPRECATED /* 131072 */:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case Opcodes.ASM8 /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
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
                        switch (i) {
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
                                switch (i) {
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

    /* renamed from: r */
    public static ClickableSpan[] m20750r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public final SparseArray m20751A(View view) {
        return (SparseArray) view.getTag(u8e.tag_accessibility_clickable_spans);
    }

    public void A0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17768a.setHeading(z);
        } else {
            i0(2, z);
        }
    }

    /* renamed from: B */
    public CharSequence m20752B() {
        return Build.VERSION.SDK_INT >= 30 ? C12625b.m20806b(this.f17768a) : this.f17768a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17768a.setHintText(charSequence);
        } else {
            this.f17768a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: C */
    public CharSequence m20753C() {
        if (!m20757G()) {
            return this.f17768a.getText();
        }
        List listM20784h = m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listM20784h2 = m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listM20784h3 = m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listM20784h4 = m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f17768a.getText(), 0, this.f17768a.getText().length()));
        for (int i = 0; i < listM20784h.size(); i++) {
            spannableString.setSpan(new cb(((Integer) listM20784h4.get(i)).intValue(), this, m20796v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listM20784h.get(i)).intValue(), ((Integer) listM20784h2.get(i)).intValue(), ((Integer) listM20784h3.get(i)).intValue());
        }
        return spannableString;
    }

    public void C0(boolean z) {
        this.f17768a.setImportantForAccessibility(z);
    }

    /* renamed from: D */
    public CharSequence m20754D() {
        return Build.VERSION.SDK_INT >= 28 ? this.f17768a.getTooltipText() : this.f17768a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void D0(View view) {
        this.f17768a.setLabelFor(view);
    }

    /* renamed from: E */
    public String m20755E() {
        return Build.VERSION.SDK_INT >= 33 ? C12626c.m20814g(this.f17768a) : this.f17768a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void E0(boolean z) {
        this.f17768a.setLongClickable(z);
    }

    /* renamed from: F */
    public String m20756F() {
        return this.f17768a.getViewIdResourceName();
    }

    public void F0(int i) {
        this.f17768a.setMaxTextLength(i);
    }

    /* renamed from: G */
    public final boolean m20757G() {
        return !m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void G0(int i) {
        this.f17768a.setMovementGranularities(i);
    }

    /* renamed from: H */
    public final int m20758H(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f17767d;
        f17767d = i2 + 1;
        return i2;
    }

    public void H0(CharSequence charSequence) {
        this.f17768a.setPackageName(charSequence);
    }

    /* renamed from: I */
    public boolean m20759I() {
        return Build.VERSION.SDK_INT >= 34 ? C12627d.m20823f(this.f17768a) : m20787l(64);
    }

    public void I0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17768a.setPaneTitle(charSequence);
        } else {
            this.f17768a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: J */
    public boolean m20760J() {
        return this.f17768a.isAccessibilityFocused();
    }

    public void J0(View view) {
        this.f17769b = -1;
        this.f17768a.setParent(view);
    }

    /* renamed from: K */
    public boolean m20761K() {
        return this.f17768a.isCheckable();
    }

    public void K0(View view, int i) {
        this.f17769b = i;
        this.f17768a.setParent(view, i);
    }

    /* renamed from: L */
    public boolean m20762L() {
        return this.f17768a.isChecked();
    }

    public void L0(boolean z) {
        this.f17768a.setPassword(z);
    }

    /* renamed from: M */
    public boolean m20763M() {
        return this.f17768a.isClickable();
    }

    public void M0(C12630g c12630g) {
        this.f17768a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c12630g.f17821a);
    }

    /* renamed from: N */
    public boolean m20764N() {
        return this.f17768a.isContextClickable();
    }

    public void N0(CharSequence charSequence) {
        this.f17768a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: O */
    public boolean m20765O() {
        return this.f17768a.isEnabled();
    }

    public void O0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f17768a.setScreenReaderFocusable(z);
        } else {
            i0(1, z);
        }
    }

    /* renamed from: P */
    public boolean m20766P() {
        return this.f17768a.isFocusable();
    }

    public void P0(boolean z) {
        this.f17768a.setScrollable(z);
    }

    /* renamed from: Q */
    public boolean m20767Q() {
        return this.f17768a.isFocused();
    }

    public void Q0(boolean z) {
        this.f17768a.setSelected(z);
    }

    /* renamed from: R */
    public boolean m20768R() {
        return m20787l(67108864);
    }

    public void R0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f17768a.setShowingHintText(z);
        } else {
            i0(4, z);
        }
    }

    /* renamed from: S */
    public boolean m20769S() {
        return this.f17768a.isImportantForAccessibility();
    }

    public void S0(View view) {
        this.f17770c = -1;
        this.f17768a.setSource(view);
    }

    /* renamed from: T */
    public boolean m20770T() {
        return this.f17768a.isLongClickable();
    }

    public void T0(View view, int i) {
        this.f17770c = i;
        this.f17768a.setSource(view, i);
    }

    /* renamed from: U */
    public boolean m20771U() {
        return this.f17768a.isPassword();
    }

    public void U0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C12625b.m20807c(this.f17768a, charSequence);
        } else {
            this.f17768a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: V */
    public boolean m20772V() {
        return this.f17768a.isScrollable();
    }

    public void V0(CharSequence charSequence) {
        this.f17768a.setText(charSequence);
    }

    /* renamed from: W */
    public boolean m20773W() {
        return this.f17768a.isSelected();
    }

    public void W0(int i, int i2) {
        this.f17768a.setTextSelection(i, i2);
    }

    /* renamed from: X */
    public boolean m20774X() {
        return Build.VERSION.SDK_INT >= 26 ? this.f17768a.isShowingHintText() : m20787l(4);
    }

    public void X0(View view) {
        this.f17768a.setTraversalAfter(view);
    }

    /* renamed from: Y */
    public boolean m20775Y() {
        return Build.VERSION.SDK_INT >= 33 ? C12626c.m20815h(this.f17768a) : m20787l(8388608);
    }

    public void Y0(View view) {
        this.f17768a.setTraversalBefore(view);
    }

    /* renamed from: Z */
    public boolean m20776Z() {
        return this.f17768a.isVisibleToUser();
    }

    public void Z0(View view, int i) {
        this.f17768a.setTraversalBefore(view, i);
    }

    /* renamed from: a */
    public void m20777a(int i) {
        this.f17768a.addAction(i);
    }

    public void a1(String str) {
        this.f17768a.setViewIdResourceName(str);
    }

    /* renamed from: b */
    public void m20778b(C12624a c12624a) {
        this.f17768a.addAction((AccessibilityNodeInfo.AccessibilityAction) c12624a.f17815a);
    }

    public void b1(boolean z) {
        this.f17768a.setVisibleToUser(z);
    }

    /* renamed from: c */
    public void m20779c(View view) {
        this.f17768a.addChild(view);
    }

    public AccessibilityNodeInfo c1() {
        return this.f17768a;
    }

    /* renamed from: d */
    public void m20780d(View view, int i) {
        this.f17768a.addChild(view, i);
    }

    public boolean d0(int i, Bundle bundle) {
        return this.f17768a.performAction(i, bundle);
    }

    /* renamed from: e */
    public final void m20781e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m20784h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public void e0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cc)) {
            return false;
        }
        cc ccVar = (cc) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f17768a;
        if (accessibilityNodeInfo == null) {
            if (ccVar.f17768a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(ccVar.f17768a)) {
            return false;
        }
        return this.f17770c == ccVar.f17770c && this.f17769b == ccVar.f17769b;
    }

    /* renamed from: f */
    public void m20782f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m20783g();
            g0(view);
            ClickableSpan[] clickableSpanArrM20750r = m20750r(charSequence);
            if (clickableSpanArrM20750r == null || clickableSpanArrM20750r.length <= 0) {
                return;
            }
            m20796v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", u8e.accessibility_action_clickable_span);
            SparseArray sparseArrayM20799y = m20799y(view);
            for (int i = 0; i < clickableSpanArrM20750r.length; i++) {
                int iM20758H = m20758H(clickableSpanArrM20750r[i], sparseArrayM20799y);
                sparseArrayM20799y.put(iM20758H, new WeakReference(clickableSpanArrM20750r[i]));
                m20781e(clickableSpanArrM20750r[i], (Spanned) charSequence, iM20758H);
            }
        }
    }

    public boolean f0(C12624a c12624a) {
        return this.f17768a.removeAction((AccessibilityNodeInfo.AccessibilityAction) c12624a.f17815a);
    }

    /* renamed from: g */
    public final void m20783g() {
        this.f17768a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f17768a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f17768a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f17768a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public final void g0(View view) {
        SparseArray sparseArrayM20751A = m20751A(view);
        if (sparseArrayM20751A != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayM20751A.size(); i++) {
                if (((WeakReference) sparseArrayM20751A.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayM20751A.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: h */
    public final List m20784h(String str) {
        ArrayList<Integer> integerArrayList = this.f17768a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f17768a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void h0(boolean z) {
        this.f17768a.setAccessibilityFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f17768a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List m20785i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f17768a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C12624a(actionList.get(i)));
        }
        return arrayList;
    }

    public final void i0(int i, boolean z) {
        Bundle bundleM20796v = m20796v();
        if (bundleM20796v != null) {
            int i2 = bundleM20796v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleM20796v.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void j0(Rect rect) {
        this.f17768a.setBoundsInParent(rect);
    }

    /* renamed from: k */
    public int m20786k() {
        return this.f17768a.getActions();
    }

    public void k0(Rect rect) {
        this.f17768a.setBoundsInScreen(rect);
    }

    /* renamed from: l */
    public final boolean m20787l(int i) {
        Bundle bundleM20796v = m20796v();
        return bundleM20796v != null && (bundleM20796v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public void l0(boolean z) {
        this.f17768a.setCanOpenPopup(z);
    }

    /* renamed from: m */
    public void m20788m(Rect rect) {
        this.f17768a.getBoundsInParent(rect);
    }

    public void m0(boolean z) {
        this.f17768a.setCheckable(z);
    }

    /* renamed from: n */
    public void m20789n(Rect rect) {
        this.f17768a.getBoundsInScreen(rect);
    }

    public void n0(boolean z) {
        this.f17768a.setChecked(z);
    }

    /* renamed from: o */
    public void m20790o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            C12627d.m20819b(this.f17768a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f17768a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(CharSequence charSequence) {
        this.f17768a.setClassName(charSequence);
    }

    /* renamed from: p */
    public int m20791p() {
        return this.f17768a.getChildCount();
    }

    public void p0(boolean z) {
        this.f17768a.setClickable(z);
    }

    /* renamed from: q */
    public CharSequence m20792q() {
        return this.f17768a.getClassName();
    }

    public void q0(Object obj) {
        this.f17768a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C12628e) obj).f17819a);
    }

    public void r0(Object obj) {
        this.f17768a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C12629f) obj).f17820a);
    }

    /* renamed from: s */
    public CharSequence m20793s() {
        return Build.VERSION.SDK_INT >= 34 ? C12627d.m20820c(this.f17768a) : this.f17768a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(CharSequence charSequence) {
        this.f17768a.setContentDescription(charSequence);
    }

    /* renamed from: t */
    public CharSequence m20794t() {
        return this.f17768a.getContentDescription();
    }

    public void t0(boolean z) {
        this.f17768a.setContentInvalid(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m20788m(rect);
        sb.append("; boundsInParent: " + rect);
        m20789n(rect);
        sb.append("; boundsInScreen: " + rect);
        m20790o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m20800z());
        sb.append("; className: ");
        sb.append(m20792q());
        sb.append("; text: ");
        sb.append(m20753C());
        sb.append("; error: ");
        sb.append(m20795u());
        sb.append("; maxTextLength: ");
        sb.append(m20797w());
        sb.append("; stateDescription: ");
        sb.append(m20752B());
        sb.append("; contentDescription: ");
        sb.append(m20794t());
        sb.append("; tooltipText: ");
        sb.append(m20754D());
        sb.append("; viewIdResName: ");
        sb.append(m20756F());
        sb.append("; uniqueId: ");
        sb.append(m20755E());
        sb.append("; checkable: ");
        sb.append(m20761K());
        sb.append("; checked: ");
        sb.append(m20762L());
        sb.append("; focusable: ");
        sb.append(m20766P());
        sb.append("; focused: ");
        sb.append(m20767Q());
        sb.append("; selected: ");
        sb.append(m20773W());
        sb.append("; clickable: ");
        sb.append(m20763M());
        sb.append("; longClickable: ");
        sb.append(m20770T());
        sb.append("; contextClickable: ");
        sb.append(m20764N());
        sb.append("; enabled: ");
        sb.append(m20765O());
        sb.append("; password: ");
        sb.append(m20771U());
        sb.append("; scrollable: " + m20772V());
        sb.append("; containerTitle: ");
        sb.append(m20793s());
        sb.append("; granularScrollingSupported: ");
        sb.append(m20768R());
        sb.append("; importantForAccessibility: ");
        sb.append(m20769S());
        sb.append("; visible: ");
        sb.append(m20776Z());
        sb.append("; isTextSelectable: ");
        sb.append(m20775Y());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m20759I());
        sb.append("; [");
        List listM20785i = m20785i();
        for (int i = 0; i < listM20785i.size(); i++) {
            C12624a c12624a = (C12624a) listM20785i.get(i);
            String strM20749j = m20749j(c12624a.m20802b());
            if (strM20749j.equals("ACTION_UNKNOWN") && c12624a.m20803c() != null) {
                strM20749j = c12624a.m20803c().toString();
            }
            sb.append(strM20749j);
            if (i != listM20785i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence m20795u() {
        return this.f17768a.getError();
    }

    public void u0(boolean z) {
        this.f17768a.setDismissable(z);
    }

    /* renamed from: v */
    public Bundle m20796v() {
        return this.f17768a.getExtras();
    }

    public void v0(boolean z) {
        this.f17768a.setEditable(z);
    }

    /* renamed from: w */
    public int m20797w() {
        return this.f17768a.getMaxTextLength();
    }

    public void w0(boolean z) {
        this.f17768a.setEnabled(z);
    }

    /* renamed from: x */
    public int m20798x() {
        return this.f17768a.getMovementGranularities();
    }

    public void x0(CharSequence charSequence) {
        this.f17768a.setError(charSequence);
    }

    /* renamed from: y */
    public final SparseArray m20799y(View view) {
        SparseArray sparseArrayM20751A = m20751A(view);
        if (sparseArrayM20751A != null) {
            return sparseArrayM20751A;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(u8e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    public void y0(boolean z) {
        this.f17768a.setFocusable(z);
    }

    /* renamed from: z */
    public CharSequence m20800z() {
        return this.f17768a.getPackageName();
    }

    public void z0(boolean z) {
        this.f17768a.setFocused(z);
    }

    public cc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f17768a = accessibilityNodeInfo;
    }
}
