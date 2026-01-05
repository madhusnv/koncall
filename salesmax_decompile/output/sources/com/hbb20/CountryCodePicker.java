package com.hbb20;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.objectweb.asm.Opcodes;
import p001o.er1;
import p001o.fbe;
import p001o.i5c;
import p001o.mq8;
import p001o.nq8;
import p001o.o7d;
import p001o.o8e;
import p001o.o9e;
import p001o.s6e;
import p001o.u6d;
import p001o.y6e;

/* loaded from: classes6.dex */
public class CountryCodePicker extends RelativeLayout {
    public static String A1 = "http://schemas.android.com/apk/res/android";
    public static int y1 = 91;
    public static int z1;
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;

    /* renamed from: H */
    public LinearLayout f13452H;
    public boolean H0;
    public EnumC11553k I0;
    public String J0;
    public int K0;

    /* renamed from: L */
    public LinearLayout f13453L;
    public int L0;

    /* renamed from: M */
    public C11556a f13454M;
    public int M0;
    public Typeface N0;
    public int O0;
    public List P0;

    /* renamed from: Q */
    public C11556a f13455Q;
    public int Q0;
    public String R0;
    public int S0;
    public List T0;
    public String U0;
    public String V0;
    public EnumC11551i W0;
    public EnumC11551i X0;
    public boolean Y0;
    public boolean Z0;

    /* renamed from: a */
    public er1 f13456a;
    public boolean a1;

    /* renamed from: b */
    public String f13457b;
    public boolean b1;

    /* renamed from: c */
    public int f13458c;
    public boolean c1;

    /* renamed from: d */
    public String f13459d;
    public boolean d1;

    /* renamed from: e */
    public Context f13460e;
    public String e1;

    /* renamed from: f */
    public View f13461f;
    public TextWatcher f1;

    /* renamed from: g */
    public LayoutInflater f13462g;
    public nq8 g1;

    /* renamed from: h */
    public TextView f13463h;
    public RelativeLayout h0;
    public boolean h1;
    public CountryCodePicker i0;
    public TextWatcher i1;
    public EnumC11555m j0;
    public boolean j1;
    public String k0;
    public String k1;
    public int l0;
    public int l1;
    public EnumC11547e m0;
    public boolean m1;
    public u6d n0;
    public InterfaceC11554l n1;
    public boolean o0;
    public int o1;
    public boolean p0;
    public int p1;

    /* renamed from: q */
    public EditText f13464q;
    public boolean q0;
    public int q1;
    public boolean r0;
    public int r1;

    /* renamed from: s */
    public RelativeLayout f13465s;
    public boolean s0;
    public int s1;
    public boolean t0;
    public int t1;
    public boolean u0;
    public float u1;
    public boolean v0;
    public C11557b v1;
    public boolean w0;
    public View.OnClickListener w1;

    /* renamed from: x */
    public ImageView f13466x;
    public boolean x0;
    public View.OnClickListener x1;

    /* renamed from: y */
    public ImageView f13467y;
    public boolean y0;
    public boolean z0;

    /* renamed from: com.hbb20.CountryCodePicker$a */
    public class ViewOnClickListenerC11543a implements View.OnClickListener {
        public ViewOnClickListenerC11543a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CountryCodePicker.this.w1 != null) {
                CountryCodePicker.this.w1.onClick(view);
                return;
            }
            if (CountryCodePicker.this.m15828p()) {
                CountryCodePicker countryCodePicker = CountryCodePicker.this;
                if (countryCodePicker.E0) {
                    countryCodePicker.m15837y(countryCodePicker.getSelectedCountryNameCode());
                } else {
                    countryCodePicker.m15836x();
                }
            }
        }
    }

    /* renamed from: com.hbb20.CountryCodePicker$b */
    public class C11544b implements TextWatcher {

        /* renamed from: a */
        public String f13469a = null;

        public C11544b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C11556a selectedCountry = CountryCodePicker.this.getSelectedCountry();
            if (selectedCountry != null) {
                String str = this.f13469a;
                if (str == null || !str.equals(charSequence.toString())) {
                    CountryCodePicker countryCodePicker = CountryCodePicker.this;
                    if (countryCodePicker.j1) {
                        if (countryCodePicker.v1 != null) {
                            String string = CountryCodePicker.this.getEditText_registeredCarrierNumber().getText().toString();
                            if (string.length() >= CountryCodePicker.this.v1.f13486b) {
                                String strM50996R = u6d.m50996R(string);
                                if (strM50996R.length() >= CountryCodePicker.this.v1.f13486b) {
                                    String strSubstring = strM50996R.substring(0, CountryCodePicker.this.v1.f13486b);
                                    if (!strSubstring.equals(CountryCodePicker.this.k1)) {
                                        C11557b c11557b = CountryCodePicker.this.v1;
                                        CountryCodePicker countryCodePicker2 = CountryCodePicker.this;
                                        C11556a c11556aM15874d = c11557b.m15874d(countryCodePicker2.f13460e, countryCodePicker2.getLanguageToApply(), strSubstring);
                                        if (!c11556aM15874d.equals(selectedCountry)) {
                                            CountryCodePicker countryCodePicker3 = CountryCodePicker.this;
                                            countryCodePicker3.m1 = true;
                                            countryCodePicker3.l1 = Selection.getSelectionEnd(charSequence);
                                            CountryCodePicker.this.setSelectedCountry(c11556aM15874d);
                                        }
                                        CountryCodePicker.this.k1 = strSubstring;
                                    }
                                }
                            }
                        }
                        this.f13469a = charSequence.toString();
                    }
                }
            }
        }
    }

    /* renamed from: com.hbb20.CountryCodePicker$c */
    public class C11545c implements TextWatcher {
        public C11545c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (CountryCodePicker.this.n1 != null) {
                boolean zM15835w = CountryCodePicker.this.m15835w();
                CountryCodePicker countryCodePicker = CountryCodePicker.this;
                if (zM15835w != countryCodePicker.h1) {
                    countryCodePicker.h1 = zM15835w;
                    countryCodePicker.n1.mo15839a(CountryCodePicker.this.h1);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.hbb20.CountryCodePicker$d */
    public static /* synthetic */ class C11546d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13472a;

        static {
            int[] iArr = new int[EnumC11553k.values().length];
            f13472a = iArr;
            try {
                iArr[EnumC11553k.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13472a[EnumC11553k.FIXED_LINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13472a[EnumC11553k.FIXED_LINE_OR_MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13472a[EnumC11553k.TOLL_FREE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13472a[EnumC11553k.PREMIUM_RATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13472a[EnumC11553k.SHARED_COST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13472a[EnumC11553k.VOIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13472a[EnumC11553k.PERSONAL_NUMBER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13472a[EnumC11553k.PAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13472a[EnumC11553k.UAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13472a[EnumC11553k.VOICEMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13472a[EnumC11553k.UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: com.hbb20.CountryCodePicker$e */
    public enum EnumC11547e {
        SIM_ONLY("1"),
        NETWORK_ONLY("2"),
        LOCALE_ONLY("3"),
        SIM_NETWORK("12"),
        NETWORK_SIM("21"),
        SIM_LOCALE("13"),
        LOCALE_SIM("31"),
        NETWORK_LOCALE("23"),
        LOCALE_NETWORK("32"),
        SIM_NETWORK_LOCALE("123"),
        SIM_LOCALE_NETWORK("132"),
        NETWORK_SIM_LOCALE("213"),
        NETWORK_LOCALE_SIM("231"),
        LOCALE_SIM_NETWORK("312"),
        LOCALE_NETWORK_SIM("321");

        String representation;

        EnumC11547e(String str) {
            this.representation = str;
        }

        public static EnumC11547e getPrefForValue(String str) {
            for (EnumC11547e enumC11547e : values()) {
                if (enumC11547e.representation.equals(str)) {
                    return enumC11547e;
                }
            }
            return SIM_NETWORK_LOCALE;
        }
    }

    /* renamed from: com.hbb20.CountryCodePicker$f */
    public interface InterfaceC11548f {
    }

    /* renamed from: com.hbb20.CountryCodePicker$g */
    public interface InterfaceC11549g {
    }

    /* renamed from: com.hbb20.CountryCodePicker$h */
    public interface InterfaceC11550h {
    }

    /* renamed from: com.hbb20.CountryCodePicker$j */
    public interface InterfaceC11552j {
    }

    /* renamed from: com.hbb20.CountryCodePicker$k */
    public enum EnumC11553k {
        MOBILE,
        FIXED_LINE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    /* renamed from: com.hbb20.CountryCodePicker$l */
    public interface InterfaceC11554l {
        /* renamed from: a */
        void mo15839a(boolean z);
    }

    /* renamed from: com.hbb20.CountryCodePicker$m */
    public enum EnumC11555m {
        LEFT(-1),
        CENTER(0),
        RIGHT(1);

        int enumIndex;

        EnumC11555m(int i) {
            this.enumIndex = i;
        }
    }

    public CountryCodePicker(Context context) {
        super(context);
        this.f13456a = new mq8();
        this.f13457b = "CCP_PREF_FILE";
        this.k0 = "";
        this.m0 = EnumC11547e.SIM_NETWORK_LOCALE;
        this.o0 = true;
        this.p0 = true;
        this.q0 = true;
        this.r0 = true;
        this.s0 = true;
        this.t0 = false;
        this.u0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.A0 = false;
        this.B0 = false;
        this.C0 = true;
        this.D0 = true;
        this.E0 = false;
        this.F0 = false;
        this.G0 = false;
        this.H0 = true;
        this.I0 = EnumC11553k.MOBILE;
        this.J0 = "ccp_last_selection";
        this.K0 = -99;
        this.L0 = -99;
        this.Q0 = z1;
        this.S0 = 0;
        EnumC11551i enumC11551i = EnumC11551i.ENGLISH;
        this.W0 = enumC11551i;
        this.X0 = enumC11551i;
        this.Y0 = true;
        this.Z0 = true;
        this.a1 = false;
        this.b1 = false;
        this.c1 = true;
        this.d1 = false;
        this.e1 = "notSet";
        this.k1 = null;
        this.l1 = 0;
        this.m1 = false;
        this.o1 = 0;
        this.t1 = 0;
        this.x1 = new ViewOnClickListenerC11543a();
        this.f13460e = context;
        m15824l(null);
    }

    private EnumC11551i getCCPLanguageFromLocale() {
        Locale locale = this.f13460e.getResources().getConfiguration().locale;
        for (EnumC11551i enumC11551i : EnumC11551i.values()) {
            if (enumC11551i.getCode().equalsIgnoreCase(locale.getLanguage()) && (enumC11551i.getCountry() == null || enumC11551i.getCountry().equalsIgnoreCase(locale.getCountry()) || enumC11551i.getScript() == null || enumC11551i.getScript().equalsIgnoreCase(locale.getScript()))) {
                return enumC11551i;
            }
        }
        return null;
    }

    private View.OnClickListener getCountryCodeHolderClickListener() {
        return this.x1;
    }

    private TextWatcher getCountryDetectorTextWatcher() {
        if (this.f13464q != null && this.i1 == null) {
            this.i1 = new C11544b();
        }
        return this.i1;
    }

    private C11556a getDefaultCountry() {
        return this.f13455Q;
    }

    private o7d getEnteredPhoneNumber() {
        EditText editText = this.f13464q;
        return getPhoneUtil().m51019T(editText != null ? u6d.m50996R(editText.getText().toString()) : "", getSelectedCountryNameCode());
    }

    private View getHolderView() {
        return this.f13461f;
    }

    private u6d getPhoneUtil() {
        if (this.n0 == null) {
            this.n0 = u6d.m51000e(this.f13460e);
        }
        return this.n0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11556a getSelectedCountry() {
        if (this.f13454M == null) {
            setSelectedCountry(getDefaultCountry());
        }
        return this.f13454M;
    }

    private u6d.EnumC17305c getSelectedHintNumberType() {
        switch (C11546d.f13472a[this.I0.ordinal()]) {
            case 1:
                return u6d.EnumC17305c.MOBILE;
            case 2:
                return u6d.EnumC17305c.FIXED_LINE;
            case 3:
                return u6d.EnumC17305c.FIXED_LINE_OR_MOBILE;
            case 4:
                return u6d.EnumC17305c.TOLL_FREE;
            case 5:
                return u6d.EnumC17305c.PREMIUM_RATE;
            case 6:
                return u6d.EnumC17305c.SHARED_COST;
            case 7:
                return u6d.EnumC17305c.VOIP;
            case 8:
                return u6d.EnumC17305c.PERSONAL_NUMBER;
            case 9:
                return u6d.EnumC17305c.PAGER;
            case 10:
                return u6d.EnumC17305c.UAN;
            case 11:
                return u6d.EnumC17305c.VOICEMAIL;
            case 12:
                return u6d.EnumC17305c.UNKNOWN;
            default:
                return u6d.EnumC17305c.MOBILE;
        }
    }

    private LayoutInflater getmInflater() {
        return this.f13462g;
    }

    private void setCustomDefaultLanguage(EnumC11551i enumC11551i) {
        C11556a c11556aM15848m;
        this.W0 = enumC11551i;
        m15815N();
        if (this.f13454M == null || (c11556aM15848m = C11556a.m15848m(this.f13460e, getLanguageToApply(), this.f13454M.m15868z())) == null) {
            return;
        }
        setSelectedCountry(c11556aM15848m);
    }

    private void setDefaultCountry(C11556a c11556a) {
        this.f13455Q = c11556a;
    }

    private void setHolder(RelativeLayout relativeLayout) {
        this.f13465s = relativeLayout;
    }

    private void setHolderView(View view) {
        this.f13461f = view;
    }

    /* renamed from: A */
    public void m15802A(C11556a c11556a) {
        CountryCodePicker countryCodePicker = this.i0;
        if (countryCodePicker.B0) {
            countryCodePicker.m15811J(c11556a.m15868z());
        }
        setSelectedCountry(c11556a);
    }

    /* renamed from: B */
    public final void m15803B() {
        if (this.z0) {
            this.f13466x.setVisibility(0);
        } else {
            this.f13466x.setVisibility(8);
        }
    }

    /* renamed from: C */
    public void m15804C() {
        String str = this.U0;
        if (str == null || str.length() == 0) {
            String str2 = this.V0;
            if (str2 == null || str2.length() == 0) {
                this.T0 = null;
            } else {
                this.V0 = this.V0.toLowerCase();
                List<C11556a> listM15855x = C11556a.m15855x(this.f13460e, getLanguageToApply());
                ArrayList arrayList = new ArrayList();
                for (C11556a c11556a : listM15855x) {
                    if (!this.V0.contains(c11556a.m15868z().toLowerCase())) {
                        arrayList.add(c11556a);
                    }
                }
                if (arrayList.size() > 0) {
                    this.T0 = arrayList;
                } else {
                    this.T0 = null;
                }
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : this.U0.split(",")) {
                C11556a c11556aM15848m = C11556a.m15848m(getContext(), getLanguageToApply(), str3);
                if (c11556aM15848m != null && !m15825m(c11556aM15848m, arrayList2)) {
                    arrayList2.add(c11556aM15848m);
                }
            }
            if (arrayList2.size() == 0) {
                this.T0 = null;
            } else {
                this.T0 = arrayList2;
            }
        }
        List list = this.T0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C11556a) it.next()).m15858F();
            }
        }
    }

    /* renamed from: D */
    public final void m15805D() {
        if (this.o0) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.h0.setBackgroundResource(i);
            } else {
                this.h0.setBackgroundResource(typedValue.data);
            }
        }
    }

    /* renamed from: E */
    public final void m15806E() {
        if (!this.s0) {
            this.f13453L.setVisibility(8);
        } else if (this.F0) {
            this.f13453L.setVisibility(8);
        } else {
            this.f13453L.setVisibility(0);
        }
    }

    /* renamed from: F */
    public void m15807F() {
        String str = this.R0;
        if (str == null || str.length() == 0) {
            this.P0 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.R0.split(",")) {
                C11556a c11556aM15846h = C11556a.m15846h(getContext(), this.T0, getLanguageToApply(), str2);
                if (c11556aM15846h != null && !m15825m(c11556aM15846h, arrayList)) {
                    arrayList.add(c11556aM15846h);
                }
            }
            if (arrayList.size() == 0) {
                this.P0 = null;
            } else {
                this.P0 = arrayList;
            }
        }
        List list = this.P0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C11556a) it.next()).m15858F();
            }
        }
    }

    /* renamed from: G */
    public void m15808G(EditText editText) {
        setEditText_registeredCarrierNumber(editText);
    }

    /* renamed from: H */
    public void m15809H() {
        C11556a c11556aM15848m = C11556a.m15848m(getContext(), getLanguageToApply(), getDefaultCountryNameCode());
        this.f13455Q = c11556aM15848m;
        setSelectedCountry(c11556aM15848m);
    }

    /* renamed from: I */
    public void m15810I(boolean z) {
        this.s0 = z;
        m15806E();
        if (isInEditMode()) {
            return;
        }
        setSelectedCountry(this.f13454M);
    }

    /* renamed from: J */
    public void m15811J(String str) {
        SharedPreferences.Editor editorEdit = this.f13460e.getSharedPreferences(this.f13457b, 0).edit();
        editorEdit.putString(this.J0, str);
        editorEdit.apply();
    }

    /* renamed from: K */
    public final void m15812K() {
        this.v1 = C11557b.m15872e(getSelectedCountryCodeAsInt());
    }

    /* renamed from: L */
    public final void m15813L() {
        EditText editText = this.f13464q;
        if (editText == null || this.f13454M == null) {
            if (editText == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("updateFormattingTextWatcher: EditText not registered ");
                sb.append(this.J0);
                return;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("updateFormattingTextWatcher: selected country is null ");
                sb2.append(this.J0);
                return;
            }
        }
        String strM50996R = u6d.m50996R(getEditText_registeredCarrierNumber().getText().toString());
        nq8 nq8Var = this.g1;
        if (nq8Var != null) {
            this.f13464q.removeTextChangedListener(nq8Var);
        }
        TextWatcher textWatcher = this.i1;
        if (textWatcher != null) {
            this.f13464q.removeTextChangedListener(textWatcher);
        }
        if (this.c1) {
            nq8 nq8Var2 = new nq8(this.f13460e, getSelectedCountryNameCode(), getSelectedCountryCodeAsInt(), this.H0);
            this.g1 = nq8Var2;
            this.f13464q.addTextChangedListener(nq8Var2);
        }
        if (this.C0) {
            TextWatcher countryDetectorTextWatcher = getCountryDetectorTextWatcher();
            this.i1 = countryDetectorTextWatcher;
            this.f13464q.addTextChangedListener(countryDetectorTextWatcher);
        }
        this.f13464q.setText("");
        this.f13464q.setText(strM50996R);
        EditText editText2 = this.f13464q;
        editText2.setSelection(editText2.getText().length());
    }

    /* renamed from: M */
    public final void m15814M() {
        if (this.f13464q == null || !this.d1) {
            return;
        }
        o7d o7dVarM51037t = getPhoneUtil().m51037t(getSelectedCountryNameCode(), getSelectedHintNumberType());
        String number = "";
        if (o7dVarM51037t != null) {
            number = PhoneNumberUtils.formatNumber(getSelectedCountryCodeWithPlus() + (o7dVarM51037t.m41695f() + ""), getSelectedCountryNameCode());
            if (number != null) {
                number = number.substring(getSelectedCountryCodeWithPlus().length()).trim();
            }
        }
        if (number == null) {
            number = this.k0;
        }
        this.f13464q.setHint(number);
    }

    /* renamed from: N */
    public final void m15815N() {
        if (isInEditMode()) {
            EnumC11551i enumC11551i = this.W0;
            if (enumC11551i != null) {
                this.X0 = enumC11551i;
                return;
            } else {
                this.X0 = EnumC11551i.ENGLISH;
                return;
            }
        }
        if (!m15827o()) {
            if (getCustomDefaultLanguage() != null) {
                this.X0 = this.W0;
                return;
            } else {
                this.X0 = EnumC11551i.ENGLISH;
                return;
            }
        }
        EnumC11551i cCPLanguageFromLocale = getCCPLanguageFromLocale();
        if (cCPLanguageFromLocale != null) {
            this.X0 = cCPLanguageFromLocale;
        } else if (getCustomDefaultLanguage() != null) {
            this.X0 = getCustomDefaultLanguage();
        } else {
            this.X0 = EnumC11551i.ENGLISH;
        }
    }

    /* renamed from: O */
    public final void m15816O() {
        try {
            this.f13464q.removeTextChangedListener(this.f1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean zM15835w = m15835w();
        this.h1 = zM15835w;
        InterfaceC11554l interfaceC11554l = this.n1;
        if (interfaceC11554l != null) {
            interfaceC11554l.mo15839a(zM15835w);
        }
        C11545c c11545c = new C11545c();
        this.f1 = c11545c;
        this.f13464q.addTextChangedListener(c11545c);
    }

    /* renamed from: e */
    public final void m15817e(AttributeSet attributeSet) {
        boolean z;
        TypedArray typedArrayObtainStyledAttributes = this.f13460e.getTheme().obtainStyledAttributes(attributeSet, fbe.CountryCodePicker, 0, 0);
        try {
            try {
                this.p0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_showNameCode, true);
                this.c1 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_autoFormatNumber, true);
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_showPhoneCode, true);
                this.q0 = z2;
                this.r0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_showPhoneCode, z2);
                this.D0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_showNameCode, true);
                this.v0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_showTitle, true);
                this.F0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_useFlagEmoji, false);
                this.G0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_useDummyEmojiForPreview, false);
                this.w0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_showFlag, true);
                this.E0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_initialScrollToSelection, false);
                this.x0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_rippleEnable, true);
                this.t0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_showFullName, false);
                this.u0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_showFastScroller, true);
                this.S0 = typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccpDialog_fastScroller_bubbleColor, 0);
                this.o1 = typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccpDialog_fastScroller_handleColor, 0);
                this.t1 = typedArrayObtainStyledAttributes.getResourceId(fbe.CountryCodePicker_ccpDialog_fastScroller_bubbleTextAppearance, 0);
                this.a1 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_autoDetectLanguage, false);
                this.C0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_areaCodeDetectedCountry, true);
                this.B0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_rememberLastSelection, false);
                this.d1 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_hintExampleNumber, false);
                this.H0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_internationalFormattingOnly, true);
                int dimension = (int) typedArrayObtainStyledAttributes.getDimension(fbe.CountryCodePicker_ccp_padding, this.f13460e.getResources().getDimension(y6e.ccp_padding));
                this.l0 = dimension;
                this.h0.setPadding(dimension, dimension, dimension, dimension);
                this.I0 = EnumC11553k.values()[typedArrayObtainStyledAttributes.getInt(fbe.CountryCodePicker_ccp_hintExampleNumberType, 0)];
                String string = typedArrayObtainStyledAttributes.getString(fbe.CountryCodePicker_ccp_selectionMemoryTag);
                this.J0 = string;
                if (string == null) {
                    this.J0 = "CCP_last_selection";
                }
                this.m0 = EnumC11547e.getPrefForValue(String.valueOf(typedArrayObtainStyledAttributes.getInt(fbe.CountryCodePicker_ccp_countryAutoDetectionPref, Opcodes.LSHR)));
                this.b1 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_autoDetectCountry, false);
                this.z0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_showArrow, true);
                m15803B();
                this.A0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_showCloseIcon, false);
                this.o0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_rippleEnable, true);
                m15805D();
                m15810I(typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_showFlag, true));
                setDialogKeyboardAutoPopup(typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_keyboardAutoPopup, true));
                this.W0 = m15823k(typedArrayObtainStyledAttributes.getInt(fbe.CountryCodePicker_ccp_defaultLanguage, EnumC11551i.ENGLISH.ordinal()));
                m15815N();
                this.U0 = typedArrayObtainStyledAttributes.getString(fbe.CountryCodePicker_ccp_customMasterCountries);
                this.V0 = typedArrayObtainStyledAttributes.getString(fbe.CountryCodePicker_ccp_excludedCountries);
                if (!isInEditMode()) {
                    m15804C();
                }
                this.R0 = typedArrayObtainStyledAttributes.getString(fbe.CountryCodePicker_ccp_countryPreference);
                if (!isInEditMode()) {
                    m15807F();
                }
                if (typedArrayObtainStyledAttributes.hasValue(fbe.CountryCodePicker_ccp_textGravity)) {
                    this.Q0 = typedArrayObtainStyledAttributes.getInt(fbe.CountryCodePicker_ccp_textGravity, z1);
                }
                m15818f(this.Q0);
                String string2 = typedArrayObtainStyledAttributes.getString(fbe.CountryCodePicker_ccp_defaultNameCode);
                this.f13459d = string2;
                if (string2 == null || string2.length() == 0) {
                    z = false;
                } else {
                    if (isInEditMode()) {
                        if (C11556a.m15847j(this.f13459d) != null) {
                            setDefaultCountry(C11556a.m15847j(this.f13459d));
                            setSelectedCountry(this.f13455Q);
                            z = true;
                        }
                        z = false;
                    } else {
                        if (C11556a.m15848m(getContext(), getLanguageToApply(), this.f13459d) != null) {
                            setDefaultCountry(C11556a.m15848m(getContext(), getLanguageToApply(), this.f13459d));
                            setSelectedCountry(this.f13455Q);
                            z = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        setDefaultCountry(C11556a.m15847j("IN"));
                        setSelectedCountry(this.f13455Q);
                        z = true;
                    }
                }
                int integer = typedArrayObtainStyledAttributes.getInteger(fbe.CountryCodePicker_ccp_defaultPhoneCode, -1);
                if (!z && integer != -1) {
                    if (isInEditMode()) {
                        C11556a c11556aM15845g = C11556a.m15845g(integer + "");
                        if (c11556aM15845g == null) {
                            c11556aM15845g = C11556a.m15845g(y1 + "");
                        }
                        setDefaultCountry(c11556aM15845g);
                        setSelectedCountry(c11556aM15845g);
                    } else {
                        if (integer != -1 && C11556a.m15843d(getContext(), getLanguageToApply(), this.P0, integer) == null) {
                            integer = y1;
                        }
                        setDefaultCountryUsingPhoneCode(integer);
                        setSelectedCountry(this.f13455Q);
                    }
                }
                if (getDefaultCountry() == null) {
                    setDefaultCountry(C11556a.m15847j("IN"));
                    if (getSelectedCountry() == null) {
                        setSelectedCountry(this.f13455Q);
                    }
                }
                if (m15826n() && !isInEditMode()) {
                    setAutoDetectedCountry(true);
                }
                if (this.B0 && !isInEditMode()) {
                    m15838z();
                }
                setArrowColor(typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccp_arrowColor, -99));
                int color = isInEditMode() ? typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccp_contentColor, -99) : typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccp_contentColor, this.f13460e.getResources().getColor(s6e.defaultContentColor));
                if (color != -99) {
                    setContentColor(color);
                }
                int color2 = isInEditMode() ? typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccp_flagBorderColor, 0) : typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccp_flagBorderColor, this.f13460e.getResources().getColor(s6e.defaultBorderFlagColor));
                if (color2 != 0) {
                    setFlagBorderColor(color2);
                }
                setDialogBackgroundColor(typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccpDialog_backgroundColor, 0));
                setDialogBackground(typedArrayObtainStyledAttributes.getResourceId(fbe.CountryCodePicker_ccpDialog_background, 0));
                setDialogTextColor(typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccpDialog_textColor, 0));
                setDialogSearchEditTextTintColor(typedArrayObtainStyledAttributes.getColor(fbe.CountryCodePicker_ccpDialog_searchEditTextTint, 0));
                setDialogCornerRaius(typedArrayObtainStyledAttributes.getDimension(fbe.CountryCodePicker_ccpDialog_cornerRadius, 0.0f));
                int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(fbe.CountryCodePicker_ccp_textSize, 0);
                if (dimensionPixelSize > 0) {
                    this.f13463h.setTextSize(0, dimensionPixelSize);
                    setFlagSize(dimensionPixelSize);
                    setArrowSize(dimensionPixelSize);
                }
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(fbe.CountryCodePicker_ccp_arrowSize, 0);
                if (dimensionPixelSize2 > 0) {
                    setArrowSize(dimensionPixelSize2);
                }
                this.y0 = typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccpDialog_allowSearch, true);
                setCcpClickable(typedArrayObtainStyledAttributes.getBoolean(fbe.CountryCodePicker_ccp_clickable, true));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f */
    public final void m15818f(int i) {
        if (i == EnumC11555m.LEFT.enumIndex) {
            this.f13463h.setGravity(3);
        } else if (i == EnumC11555m.CENTER.enumIndex) {
            this.f13463h.setGravity(17);
        } else {
            this.f13463h.setGravity(5);
        }
    }

    /* renamed from: g */
    public final String m15819g(String str, C11556a c11556a) {
        int iIndexOf;
        return (c11556a == null || str == null || str.isEmpty() || (iIndexOf = str.indexOf(c11556a.m15856B())) == -1) ? str : str.substring(iIndexOf + c11556a.m15856B().length());
    }

    public boolean getCcpDialogRippleEnable() {
        return this.x0;
    }

    public boolean getCcpDialogShowFlag() {
        return this.w0;
    }

    public boolean getCcpDialogShowNameCode() {
        return this.D0;
    }

    public boolean getCcpDialogShowTitle() {
        return this.v0;
    }

    public int getContentColor() {
        return this.K0;
    }

    public EnumC11555m getCurrentTextGravity() {
        return this.j0;
    }

    public EnumC11551i getCustomDefaultLanguage() {
        return this.W0;
    }

    public List<C11556a> getCustomMasterCountriesList() {
        return this.T0;
    }

    public String getCustomMasterCountriesParam() {
        return this.U0;
    }

    public String getDefaultCountryCode() {
        return this.f13455Q.f13480b;
    }

    public int getDefaultCountryCodeAsInt() {
        try {
            return Integer.parseInt(getDefaultCountryCode());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getDefaultCountryCodeWithPlus() {
        return "+" + getDefaultCountryCode();
    }

    public String getDefaultCountryName() {
        C11556a defaultCountry = getDefaultCountry();
        return defaultCountry == null ? "" : defaultCountry.f13481c;
    }

    public String getDefaultCountryNameCode() {
        C11556a defaultCountry = getDefaultCountry();
        return defaultCountry == null ? "" : defaultCountry.f13479a.toUpperCase(Locale.US);
    }

    public int getDialogBackgroundColor() {
        return this.q1;
    }

    public int getDialogBackgroundResId() {
        return this.p1;
    }

    public float getDialogCornerRadius() {
        return this.u1;
    }

    public InterfaceC11549g getDialogEventsListener() {
        return null;
    }

    public int getDialogSearchEditTextTintColor() {
        return this.s1;
    }

    public int getDialogTextColor() {
        return this.r1;
    }

    public String getDialogTitle() {
        return C11556a.m15851r(this.f13460e, getLanguageToApply());
    }

    public Typeface getDialogTypeFace() {
        return this.N0;
    }

    public int getDialogTypeFaceStyle() {
        return this.O0;
    }

    public EditText getEditText_registeredCarrierNumber() {
        return this.f13464q;
    }

    public int getFastScrollerBubbleColor() {
        return this.S0;
    }

    public int getFastScrollerBubbleTextAppearance() {
        return this.t1;
    }

    public int getFastScrollerHandleColor() {
        return this.o1;
    }

    public String getFormattedFullNumber() {
        try {
            return "+" + getPhoneUtil().m51029k(getEnteredPhoneNumber(), u6d.EnumC17304b.INTERNATIONAL).substring(1);
        } catch (i5c unused) {
            return getFullNumberWithPlus();
        }
    }

    public String getFullNumber() {
        try {
            return getPhoneUtil().m51029k(getEnteredPhoneNumber(), u6d.EnumC17304b.E164).substring(1);
        } catch (i5c unused) {
            return getSelectedCountryCode() + u6d.m50996R(this.f13464q.getText().toString());
        }
    }

    public String getFullNumberWithPlus() {
        return "+" + getFullNumber();
    }

    public RelativeLayout getHolder() {
        return this.f13465s;
    }

    public ImageView getImageViewFlag() {
        return this.f13467y;
    }

    public EnumC11551i getLanguageToApply() {
        if (this.X0 == null) {
            m15815N();
        }
        return this.X0;
    }

    public String getNoResultACK() {
        return C11556a.m15840A(this.f13460e, getLanguageToApply());
    }

    public String getSearchHintText() {
        return C11556a.m15841C(this.f13460e, getLanguageToApply());
    }

    public String getSelectedCountryCode() {
        return getSelectedCountry().f13480b;
    }

    public int getSelectedCountryCodeAsInt() {
        try {
            return Integer.parseInt(getSelectedCountryCode());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public String getSelectedCountryCodeWithPlus() {
        return "+" + getSelectedCountryCode();
    }

    public String getSelectedCountryEnglishName() {
        return getSelectedCountry().m15865s();
    }

    public int getSelectedCountryFlagResourceId() {
        return getSelectedCountry().f13483e;
    }

    public String getSelectedCountryName() {
        return getSelectedCountry().f13481c;
    }

    public String getSelectedCountryNameCode() {
        return getSelectedCountry().f13479a.toUpperCase(Locale.US);
    }

    public TextView getTextView_selectedCountry() {
        return this.f13463h;
    }

    /* renamed from: h */
    public boolean m15820h(boolean z) {
        try {
            String country = this.f13460e.getResources().getConfiguration().locale.getCountry();
            if (country != null && !country.isEmpty() && m15831s(country)) {
                setSelectedCountry(C11556a.m15848m(getContext(), getLanguageToApply(), country));
                return true;
            }
            if (z) {
                m15809H();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            if (z) {
                m15809H();
            }
            return false;
        }
    }

    /* renamed from: i */
    public boolean m15821i(boolean z) {
        try {
            String networkCountryIso = ((TelephonyManager) this.f13460e.getSystemService("phone")).getNetworkCountryIso();
            if (networkCountryIso != null && !networkCountryIso.isEmpty() && m15831s(networkCountryIso)) {
                setSelectedCountry(C11556a.m15848m(getContext(), getLanguageToApply(), networkCountryIso));
                return true;
            }
            if (z) {
                m15809H();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            if (z) {
                m15809H();
            }
            return false;
        }
    }

    /* renamed from: j */
    public boolean m15822j(boolean z) {
        try {
            String simCountryIso = ((TelephonyManager) this.f13460e.getSystemService("phone")).getSimCountryIso();
            if (simCountryIso != null && !simCountryIso.isEmpty() && m15831s(simCountryIso)) {
                setSelectedCountry(C11556a.m15848m(getContext(), getLanguageToApply(), simCountryIso));
                return true;
            }
            if (z) {
                m15809H();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            if (z) {
                m15809H();
            }
            return false;
        }
    }

    /* renamed from: k */
    public final EnumC11551i m15823k(int i) {
        return i < EnumC11551i.values().length ? EnumC11551i.values()[i] : EnumC11551i.ENGLISH;
    }

    /* renamed from: l */
    public final void m15824l(AttributeSet attributeSet) {
        String str;
        this.f13462g = LayoutInflater.from(this.f13460e);
        if (attributeSet != null) {
            this.e1 = attributeSet.getAttributeValue(A1, "layout_width");
        }
        removeAllViewsInLayout();
        if (attributeSet == null || (str = this.e1) == null || !(str.equals("-1") || this.e1.equals("-1") || this.e1.equals("fill_parent") || this.e1.equals("match_parent"))) {
            this.f13461f = this.f13462g.inflate(o9e.layout_code_picker, (ViewGroup) this, true);
        } else {
            this.f13461f = this.f13462g.inflate(o9e.layout_full_width_code_picker, (ViewGroup) this, true);
        }
        this.f13463h = (TextView) this.f13461f.findViewById(o8e.textView_selectedCountry);
        this.f13465s = (RelativeLayout) this.f13461f.findViewById(o8e.countryCodeHolder);
        this.f13466x = (ImageView) this.f13461f.findViewById(o8e.imageView_arrow);
        this.f13467y = (ImageView) this.f13461f.findViewById(o8e.image_flag);
        this.f13453L = (LinearLayout) this.f13461f.findViewById(o8e.linear_flag_holder);
        this.f13452H = (LinearLayout) this.f13461f.findViewById(o8e.linear_flag_border);
        this.h0 = (RelativeLayout) this.f13461f.findViewById(o8e.rlClickConsumer);
        this.i0 = this;
        if (attributeSet != null) {
            m15817e(attributeSet);
        }
        this.h0.setOnClickListener(this.x1);
    }

    /* renamed from: m */
    public final boolean m15825m(C11556a c11556a, List list) {
        if (c11556a == null || list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C11556a) it.next()).m15868z().equalsIgnoreCase(c11556a.m15868z())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean m15826n() {
        return this.b1;
    }

    /* renamed from: o */
    public boolean m15827o() {
        return this.a1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AbstractC11558c.m15876b();
        super.onDetachedFromWindow();
    }

    /* renamed from: p */
    public boolean m15828p() {
        return this.Z0;
    }

    /* renamed from: q */
    public boolean m15829q() {
        return this.r0;
    }

    /* renamed from: r */
    public boolean m15830r() {
        return this.Y0;
    }

    /* renamed from: s */
    public final boolean m15831s(String str) {
        Iterator it = C11556a.m15850o(this.f13460e, this).iterator();
        while (it.hasNext()) {
            if (((C11556a) it.next()).f13479a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void setArrowColor(int i) {
        this.L0 = i;
        if (i != -99) {
            this.f13466x.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            return;
        }
        int i2 = this.K0;
        if (i2 != -99) {
            this.f13466x.setColorFilter(i2, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setArrowSize(int i) {
        if (i > 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13466x.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f13466x.setLayoutParams(layoutParams);
        }
    }

    public void setAutoDetectedCountry(boolean z) {
        boolean zM15822j = false;
        for (int i = 0; i < this.m0.representation.length(); i++) {
            try {
                switch (this.m0.representation.charAt(i)) {
                    case '1':
                        zM15822j = m15822j(false);
                        break;
                    case '2':
                        zM15822j = m15821i(false);
                        break;
                    case '3':
                        zM15822j = m15820h(false);
                        break;
                }
                if (zM15822j) {
                    if (zM15822j && z) {
                        m15809H();
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder sb = new StringBuilder();
                sb.append("setAutoDetectCountry: Exception");
                sb.append(e.getMessage());
                if (z) {
                    m15809H();
                    return;
                }
                return;
            }
        }
        if (zM15822j) {
        }
    }

    public void setAutoDetectionFailureListener(InterfaceC11550h interfaceC11550h) {
    }

    public void setCcpClickable(boolean z) {
        this.Z0 = z;
        if (z) {
            this.h0.setOnClickListener(this.x1);
            this.h0.setClickable(true);
            this.h0.setEnabled(true);
        } else {
            this.h0.setOnClickListener(null);
            this.h0.setClickable(false);
            this.h0.setEnabled(false);
        }
    }

    public void setCcpDialogRippleEnable(boolean z) {
        this.x0 = z;
    }

    public void setCcpDialogShowFlag(boolean z) {
        this.w0 = z;
    }

    public void setCcpDialogShowNameCode(boolean z) {
        this.D0 = z;
    }

    public void setCcpDialogShowPhoneCode(boolean z) {
        this.r0 = z;
    }

    public void setCcpDialogShowTitle(boolean z) {
        this.v0 = z;
    }

    public void setContentColor(int i) {
        this.K0 = i;
        this.f13463h.setTextColor(i);
        if (this.L0 == -99) {
            this.f13466x.setColorFilter(this.K0, PorterDuff.Mode.SRC_IN);
        }
    }

    public void setCountryAutoDetectionPref(EnumC11547e enumC11547e) {
        this.m0 = enumC11547e;
    }

    public void setCountryForNameCode(String str) {
        C11556a c11556aM15848m = C11556a.m15848m(getContext(), getLanguageToApply(), str);
        if (c11556aM15848m != null) {
            setSelectedCountry(c11556aM15848m);
            return;
        }
        if (this.f13455Q == null) {
            this.f13455Q = C11556a.m15843d(getContext(), getLanguageToApply(), this.P0, this.f13458c);
        }
        setSelectedCountry(this.f13455Q);
    }

    public void setCountryForPhoneCode(int i) {
        C11556a c11556aM15843d = C11556a.m15843d(getContext(), getLanguageToApply(), this.P0, i);
        if (c11556aM15843d != null) {
            setSelectedCountry(c11556aM15843d);
            return;
        }
        if (this.f13455Q == null) {
            this.f13455Q = C11556a.m15843d(getContext(), getLanguageToApply(), this.P0, this.f13458c);
        }
        setSelectedCountry(this.f13455Q);
    }

    public void setCountryPreference(String str) {
        this.R0 = str;
    }

    public void setCurrentTextGravity(EnumC11555m enumC11555m) {
        this.j0 = enumC11555m;
        m15818f(enumC11555m.enumIndex);
    }

    public void setCustomDialogTextProvider(InterfaceC11548f interfaceC11548f) {
    }

    public void setCustomMasterCountries(String str) {
        this.U0 = str;
    }

    public void setCustomMasterCountriesList(List<C11556a> list) {
        this.T0 = list;
    }

    public void setDefaultCountryUsingNameCode(String str) {
        C11556a c11556aM15848m = C11556a.m15848m(getContext(), getLanguageToApply(), str);
        if (c11556aM15848m == null) {
            return;
        }
        this.f13459d = c11556aM15848m.m15868z();
        setDefaultCountry(c11556aM15848m);
    }

    @Deprecated
    public void setDefaultCountryUsingPhoneCode(int i) {
        C11556a c11556aM15843d = C11556a.m15843d(getContext(), getLanguageToApply(), this.P0, i);
        if (c11556aM15843d == null) {
            return;
        }
        this.f13458c = i;
        setDefaultCountry(c11556aM15843d);
    }

    public void setDetectCountryWithAreaCode(boolean z) {
        this.C0 = z;
        m15813L();
    }

    public void setDialogBackground(int i) {
        this.p1 = i;
    }

    public void setDialogBackgroundColor(int i) {
        this.q1 = i;
    }

    public void setDialogCornerRaius(float f) {
        this.u1 = f;
    }

    public void setDialogEventsListener(InterfaceC11549g interfaceC11549g) {
    }

    public void setDialogKeyboardAutoPopup(boolean z) {
        this.Y0 = z;
    }

    public void setDialogSearchEditTextTintColor(int i) {
        this.s1 = i;
    }

    public void setDialogTextColor(int i) {
        this.r1 = i;
    }

    public void setDialogTypeFace(Typeface typeface) {
        try {
            this.N0 = typeface;
            this.O0 = -99;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEditText_registeredCarrierNumber(EditText editText) {
        this.f13464q = editText;
        if (editText.getHint() != null) {
            this.k0 = this.f13464q.getHint().toString();
        }
        m15816O();
        m15813L();
        m15814M();
    }

    public void setExcludedCountries(String str) {
        this.V0 = str;
        m15804C();
    }

    public void setFastScrollerBubbleColor(int i) {
        this.S0 = i;
    }

    public void setFastScrollerBubbleTextAppearance(int i) {
        this.t1 = i;
    }

    public void setFastScrollerHandleColor(int i) {
        this.o1 = i;
    }

    public void setFlagBorderColor(int i) {
        this.M0 = i;
        this.f13452H.setBackgroundColor(i);
    }

    public void setFlagSize(int i) {
        this.f13467y.getLayoutParams().height = i;
        this.f13467y.requestLayout();
    }

    public void setFullNumber(String str) {
        C11556a c11556aM15849n = C11556a.m15849n(getContext(), getLanguageToApply(), this.P0, str);
        if (c11556aM15849n == null) {
            c11556aM15849n = getDefaultCountry();
        }
        setSelectedCountry(c11556aM15849n);
        String strM15819g = m15819g(str, c11556aM15849n);
        if (getEditText_registeredCarrierNumber() != null) {
            getEditText_registeredCarrierNumber().setText(strM15819g);
            m15813L();
        }
    }

    public void setHintExampleNumberEnabled(boolean z) {
        this.d1 = z;
        m15814M();
    }

    public void setHintExampleNumberType(EnumC11553k enumC11553k) {
        this.I0 = enumC11553k;
        m15814M();
    }

    public void setImageViewFlag(ImageView imageView) {
        this.f13467y = imageView;
    }

    public void setInternationalFormattingOnly(boolean z) {
        this.H0 = z;
        if (this.f13464q != null) {
            m15813L();
        }
    }

    public void setLanguageToApply(EnumC11551i enumC11551i) {
        this.X0 = enumC11551i;
    }

    public void setNumberAutoFormattingEnabled(boolean z) {
        this.c1 = z;
        if (this.f13464q != null) {
            m15813L();
        }
    }

    public void setOnCountryChangeListener(InterfaceC11552j interfaceC11552j) {
    }

    public void setPhoneNumberValidityChangeListener(InterfaceC11554l interfaceC11554l) {
        this.n1 = interfaceC11554l;
        if (this.f13464q == null || interfaceC11554l == null) {
            return;
        }
        boolean zM15835w = m15835w();
        this.h1 = zM15835w;
        interfaceC11554l.mo15839a(zM15835w);
    }

    public void setSearchAllowed(boolean z) {
        this.y0 = z;
    }

    public void setSelectedCountry(C11556a c11556a) {
        er1 er1Var = this.f13456a;
        if (er1Var != null && er1Var.mo25447a(c11556a) != null) {
            this.f13463h.setContentDescription(this.f13456a.mo25447a(c11556a));
        }
        this.j1 = false;
        String str = "";
        this.k1 = "";
        if (c11556a == null && (c11556a = C11556a.m15843d(getContext(), getLanguageToApply(), this.P0, this.f13458c)) == null) {
            return;
        }
        this.f13454M = c11556a;
        if (this.s0 && this.F0) {
            if (!isInEditMode()) {
                str = "" + C11556a.m15852t(c11556a) + "  ";
            } else if (this.G0) {
                str = "🏁\u200b ";
            } else {
                str = "" + C11556a.m15852t(c11556a) + "\u200b ";
            }
        }
        if (this.t0) {
            str = str + c11556a.m15867y();
        }
        if (this.p0) {
            if (this.t0) {
                str = str + " (" + c11556a.m15868z().toUpperCase(Locale.US) + ")";
            } else {
                str = str + " " + c11556a.m15868z().toUpperCase(Locale.US);
            }
        }
        if (this.q0) {
            if (str.length() > 0) {
                str = str + "  ";
            }
            str = str + "+" + c11556a.m15856B();
        }
        this.f13463h.setText(str);
        if (!this.s0 && str.length() == 0) {
            this.f13463h.setText(str + "+" + c11556a.m15856B());
        }
        this.f13467y.setImageResource(c11556a.m15866u());
        m15813L();
        m15814M();
        if (this.f13464q != null && this.n1 != null) {
            boolean zM15835w = m15835w();
            this.h1 = zM15835w;
            this.n1.mo15839a(zM15835w);
        }
        this.j1 = true;
        if (this.m1) {
            try {
                this.f13464q.setSelection(this.l1);
                this.m1 = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        m15812K();
    }

    public void setShowFastScroller(boolean z) {
        this.u0 = z;
    }

    public void setShowPhoneCode(boolean z) {
        this.q0 = z;
        setSelectedCountry(this.f13454M);
    }

    public void setTalkBackTextProvider(er1 er1Var) {
        this.f13456a = er1Var;
        setSelectedCountry(this.f13454M);
    }

    public void setTextSize(int i) {
        if (i > 0) {
            this.f13463h.setTextSize(0, i);
            setArrowSize(i);
            setFlagSize(i);
        }
    }

    public void setTextView_selectedCountry(TextView textView) {
        this.f13463h = textView;
    }

    public void setTypeFace(Typeface typeface) {
        try {
            this.f13463h.setTypeface(typeface);
            setDialogTypeFace(typeface);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: t */
    public boolean m15832t() {
        return this.y0;
    }

    /* renamed from: u */
    public boolean m15833u() {
        return this.A0;
    }

    /* renamed from: v */
    public boolean m15834v() {
        return this.u0;
    }

    /* renamed from: w */
    public boolean m15835w() {
        if (getEditText_registeredCarrierNumber() == null || getEditText_registeredCarrierNumber().getText().length() == 0) {
            if (getEditText_registeredCarrierNumber() == null) {
                Toast.makeText(this.f13460e, "No editText for Carrier number found.", 0).show();
            }
            return false;
        }
        return getPhoneUtil().m51011F(getPhoneUtil().m51019T("+" + this.f13454M.m15856B() + getEditText_registeredCarrierNumber().getText().toString(), this.f13454M.m15868z()));
    }

    /* renamed from: x */
    public void m15836x() {
        m15837y(null);
    }

    /* renamed from: y */
    public void m15837y(String str) {
        AbstractC11558c.m15879e(this.i0, str);
    }

    /* renamed from: z */
    public final void m15838z() {
        String string = this.f13460e.getSharedPreferences(this.f13457b, 0).getString(this.J0, null);
        if (string != null) {
            setCountryForNameCode(string);
        }
    }

    /* renamed from: com.hbb20.CountryCodePicker$i */
    public enum EnumC11551i {
        AFRIKAANS("af"),
        ARABIC("ar"),
        BASQUE("eu"),
        BELARUSIAN("by"),
        BENGALI("bn"),
        CHINESE_SIMPLIFIED("zh", "CN", "Hans"),
        CHINESE_TRADITIONAL("zh", "TW", "Hant"),
        CZECH("cs"),
        DANISH("da"),
        DUTCH("nl"),
        ENGLISH("en"),
        FARSI("fa"),
        FRENCH("fr"),
        GERMAN("de"),
        GREEK("el"),
        GUJARATI("gu"),
        HAUSA("ha"),
        HEBREW("iw"),
        HINDI("hi"),
        HUNGARIAN("hu"),
        INDONESIA("in"),
        ITALIAN("it"),
        JAPANESE("ja"),
        KAZAKH("kk"),
        KOREAN("ko"),
        MARATHI("mr"),
        POLISH("pl"),
        PORTUGUESE("pt"),
        PUNJABI("pa"),
        RUSSIAN("ru"),
        SERBIAN("sr"),
        SLOVAK("sk"),
        SLOVENIAN("si"),
        SPANISH("es"),
        SWEDISH("sv"),
        TAGALOG("tl"),
        TAMIL("ta"),
        THAI("th"),
        TURKISH("tr"),
        UKRAINIAN("uk"),
        URDU("ur"),
        UZBEK("uz"),
        VIETNAMESE("vi");

        private String code;
        private String country;
        private String script;

        EnumC11551i(String str, String str2, String str3) {
            this.code = str;
            this.country = str2;
            this.script = str3;
        }

        public static EnumC11551i forCountryNameCode(String str) {
            EnumC11551i enumC11551i = ENGLISH;
            for (EnumC11551i enumC11551i2 : values()) {
                if (enumC11551i2.code.equals(str)) {
                    enumC11551i = enumC11551i2;
                }
            }
            return enumC11551i;
        }

        public String getCode() {
            return this.code;
        }

        public String getCountry() {
            return this.country;
        }

        public String getScript() {
            return this.script;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public void setScript(String str) {
            this.script = str;
        }

        EnumC11551i(String str) {
            this.code = str;
        }
    }

    public void setDialogTypeFace(Typeface typeface, int i) {
        try {
            this.N0 = typeface;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setTypeFace(Typeface typeface, int i) {
        try {
            this.f13463h.setTypeface(typeface, i);
            setDialogTypeFace(typeface, i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CountryCodePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13456a = new mq8();
        this.f13457b = "CCP_PREF_FILE";
        this.k0 = "";
        this.m0 = EnumC11547e.SIM_NETWORK_LOCALE;
        this.o0 = true;
        this.p0 = true;
        this.q0 = true;
        this.r0 = true;
        this.s0 = true;
        this.t0 = false;
        this.u0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.A0 = false;
        this.B0 = false;
        this.C0 = true;
        this.D0 = true;
        this.E0 = false;
        this.F0 = false;
        this.G0 = false;
        this.H0 = true;
        this.I0 = EnumC11553k.MOBILE;
        this.J0 = "ccp_last_selection";
        this.K0 = -99;
        this.L0 = -99;
        this.Q0 = z1;
        this.S0 = 0;
        EnumC11551i enumC11551i = EnumC11551i.ENGLISH;
        this.W0 = enumC11551i;
        this.X0 = enumC11551i;
        this.Y0 = true;
        this.Z0 = true;
        this.a1 = false;
        this.b1 = false;
        this.c1 = true;
        this.d1 = false;
        this.e1 = "notSet";
        this.k1 = null;
        this.l1 = 0;
        this.m1 = false;
        this.o1 = 0;
        this.t1 = 0;
        this.x1 = new ViewOnClickListenerC11543a();
        this.f13460e = context;
        m15824l(attributeSet);
    }

    public CountryCodePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13456a = new mq8();
        this.f13457b = "CCP_PREF_FILE";
        this.k0 = "";
        this.m0 = EnumC11547e.SIM_NETWORK_LOCALE;
        this.o0 = true;
        this.p0 = true;
        this.q0 = true;
        this.r0 = true;
        this.s0 = true;
        this.t0 = false;
        this.u0 = true;
        this.v0 = true;
        this.w0 = true;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.A0 = false;
        this.B0 = false;
        this.C0 = true;
        this.D0 = true;
        this.E0 = false;
        this.F0 = false;
        this.G0 = false;
        this.H0 = true;
        this.I0 = EnumC11553k.MOBILE;
        this.J0 = "ccp_last_selection";
        this.K0 = -99;
        this.L0 = -99;
        this.Q0 = z1;
        this.S0 = 0;
        EnumC11551i enumC11551i = EnumC11551i.ENGLISH;
        this.W0 = enumC11551i;
        this.X0 = enumC11551i;
        this.Y0 = true;
        this.Z0 = true;
        this.a1 = false;
        this.b1 = false;
        this.c1 = true;
        this.d1 = false;
        this.e1 = "notSet";
        this.k1 = null;
        this.l1 = 0;
        this.m1 = false;
        this.o1 = 0;
        this.t1 = 0;
        this.x1 = new ViewOnClickListenerC11543a();
        this.f13460e = context;
        m15824l(attributeSet);
    }
}
