package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.custom.PropertyDefinitionRepository;
import ai.salesmax.model.CallLogs;
import ai.salesmax.model.Leads;
import ai.salesmax.model.ReminderData;
import ai.salesmax.model.UserContactDetail;
import ai.salesmax.model.UserLocation;
import ai.salesmax.services.model.CloudTelephonyClickToCallResponse;
import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.format.DateFormat;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Patterns;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.datastore.generated.model.ActivityLocation;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.perf.util.Constants;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.hbb20.CountryCodePicker;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.YearMonth;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import j$.time.format.TextStyle;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public abstract class jm7 {

    /* renamed from: o.jm7$a */
    public static final class C14591a implements rl7 {

        /* renamed from: a */
        public static final C14591a f30685a = new C14591a();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final itf apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.cC();
        }
    }

    /* renamed from: o.jm7$b */
    public static final class C14592b implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f30686a;

        /* renamed from: b */
        public final /* synthetic */ Leads f30687b;

        public C14592b(String str, Leads leads) {
            this.f30686a = str;
            this.f30687b = leads;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(itf itfVar) {
            itfVar.b0(this.f30686a, 0, this.f30687b);
        }
    }

    /* renamed from: o.jm7$c */
    public static final class C14593c implements gu3 {

        /* renamed from: a */
        public static final C14593c f30688a = new C14593c();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: o.jm7$d */
    public static final class C14594d implements rl7 {

        /* renamed from: a */
        public static final C14594d f30689a = new C14594d();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final itf apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.cC();
        }
    }

    /* renamed from: o.jm7$e */
    public static final class C14595e implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f30690a;

        /* renamed from: b */
        public final /* synthetic */ int f30691b;

        /* renamed from: c */
        public final /* synthetic */ Leads f30692c;

        public C14595e(String str, int i, Leads leads) {
            this.f30690a = str;
            this.f30691b = i;
            this.f30692c = leads;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(itf itfVar) {
            itfVar.c0(this.f30690a, Integer.valueOf(this.f30691b), this.f30692c);
        }
    }

    /* renamed from: o.jm7$f */
    public static final class C14596f implements gu3 {

        /* renamed from: a */
        public static final C14596f f30693a = new C14596f();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: o.jm7$g */
    public static final class C14597g extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C14597g f30694a = new C14597g();

        public C14597g() {
            super(1);
        }

        /* renamed from: a */
        public final void m34073a(CloudTelephonyClickToCallResponse cloudTelephonyClickToCallResponse) {
            sq8.m48649h(cloudTelephonyClickToCallResponse, "it");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m34073a((CloudTelephonyClickToCallResponse) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jm7$h */
    public static final class C14598h implements rl7 {

        /* renamed from: a */
        public static final C14598h f30695a = new C14598h();

        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final itf apply(uni uniVar) {
            sq8.m48649h(uniVar, "it");
            return uniVar.cC();
        }
    }

    /* renamed from: o.jm7$i */
    public static final class C14599i implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ String f30696a;

        public C14599i(String str) {
            this.f30696a = str;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(itf itfVar) {
            itfVar.d0(this.f30696a, 0);
        }
    }

    /* renamed from: o.jm7$j */
    public static final class C14600j implements gu3 {

        /* renamed from: a */
        public static final C14600j f30697a = new C14600j();

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
        }
    }

    /* renamed from: o.jm7$k */
    public static final class C14601k extends ClickableSpan {

        /* renamed from: a */
        public final /* synthetic */ ck6 f30698a;

        /* renamed from: b */
        public final /* synthetic */ int f30699b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f30700c;

        public C14601k(ck6 ck6Var, int i, ArrayList arrayList) {
            this.f30698a = ck6Var;
            this.f30699b = i;
            this.f30700c = arrayList;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            sq8.m48649h(view, "textView");
            ck6 ck6Var = this.f30698a;
            int i = this.f30699b;
            ck6Var.mo708b(view, i, this.f30700c.get(i));
        }
    }

    /* renamed from: o.jm7$l */
    public static final class C14602l implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ gge f30701a;

        /* renamed from: b */
        public final /* synthetic */ x6c f30702b;

        public C14602l(gge ggeVar, x6c x6cVar) {
            this.f30701a = ggeVar;
            this.f30702b = x6cVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(String str) {
            sq8.m48649h(str, "it");
            ((AtomicReference) this.f30701a.f25106a).set(String.valueOf(this.f30702b));
        }
    }

    /* renamed from: o.jm7$m */
    public static final class C14603m implements gu3 {

        /* renamed from: a */
        public final /* synthetic */ Leads f30703a;

        /* renamed from: b */
        public final /* synthetic */ Activity f30704b;

        /* renamed from: c */
        public final /* synthetic */ gge f30705c;

        public C14603m(Leads leads, Activity activity, gge ggeVar) {
            this.f30703a = leads;
            this.f30704b = activity;
            this.f30705c = ggeVar;
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            sq8.m48649h(th, "it");
            jm7.m34048h(this.f30703a, this.f30704b, (AtomicReference) this.f30705c.f25106a);
        }
    }

    /* renamed from: o.jm7$n */
    public static final class C14604n implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ String f30706a;

        /* renamed from: b */
        public final /* synthetic */ MaterialButton f30707b;

        public C14604n(String str, MaterialButton materialButton) {
            this.f30706a = str;
            this.f30707b = materialButton;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (sq8.m48644c(this.f30706a, String.valueOf(charSequence))) {
                return;
            }
            this.f30707b.setEnabled(true);
        }
    }

    /* renamed from: o.jm7$o */
    public static final class C14605o implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ TextInputLayout f30708a;

        /* renamed from: b */
        public final /* synthetic */ String f30709b;

        public C14605o(TextInputLayout textInputLayout, String str) {
            this.f30708a = textInputLayout;
            this.f30709b = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48646e(charSequence);
            if (charSequence.length() > 0) {
                this.f30708a.setError(this.f30709b);
            } else {
                this.f30708a.setError(null);
            }
        }
    }

    /* renamed from: o.jm7$p */
    public static final class C14606p implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ TextInputLayout f30710a;

        /* renamed from: b */
        public final /* synthetic */ String f30711b;

        public C14606p(TextInputLayout textInputLayout, String str) {
            this.f30710a = textInputLayout;
            this.f30711b = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48646e(charSequence);
            if (charSequence.length() <= 0) {
                this.f30710a.setError(null);
            } else if (jm7.i0(charSequence)) {
                this.f30710a.setError(null);
            } else {
                this.f30710a.setError(this.f30711b);
            }
        }
    }

    /* renamed from: o.jm7$q */
    public static final class C14607q implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ TextInputLayout f30712a;

        /* renamed from: b */
        public final /* synthetic */ String f30713b;

        public C14607q(TextInputLayout textInputLayout, String str) {
            this.f30712a = textInputLayout;
            this.f30713b = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            sq8.m48646e(charSequence);
            if (charSequence.length() > 0) {
                this.f30712a.setError(null);
            } else {
                this.f30712a.setError(this.f30713b);
            }
        }
    }

    /* renamed from: o.jm7$r */
    public static final class C14608r implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ MaterialButton f30714a;

        /* renamed from: b */
        public final /* synthetic */ String f30715b;

        public C14608r(MaterialButton materialButton, String str) {
            this.f30714a = materialButton;
            this.f30715b = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (jm7.i0(String.valueOf(charSequence))) {
                this.f30714a.setEnabled(true);
            } else if (sq8.m48644c(this.f30715b, String.valueOf(charSequence))) {
                this.f30714a.setEnabled(false);
            } else {
                this.f30714a.setEnabled(false);
            }
        }
    }

    /* renamed from: o.jm7$s */
    public static final class C14609s implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ MaterialButton f30716a;

        /* renamed from: b */
        public final /* synthetic */ TextInputEditText f30717b;

        /* renamed from: c */
        public final /* synthetic */ TextInputEditText f30718c;

        /* renamed from: d */
        public final /* synthetic */ CountryCodePicker f30719d;

        public C14609s(MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, CountryCodePicker countryCodePicker) {
            this.f30716a = materialButton;
            this.f30717b = textInputEditText;
            this.f30718c = textInputEditText2;
            this.f30719d = countryCodePicker;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f30716a.setEnabled(jm7.m34047g(this.f30717b, this.f30718c, this.f30719d));
        }
    }

    /* renamed from: o.jm7$t */
    public static final class C14610t implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ MaterialButton f30720a;

        /* renamed from: b */
        public final /* synthetic */ TextInputEditText f30721b;

        /* renamed from: c */
        public final /* synthetic */ TextInputEditText f30722c;

        /* renamed from: d */
        public final /* synthetic */ CountryCodePicker f30723d;

        public C14610t(MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, CountryCodePicker countryCodePicker) {
            this.f30720a = materialButton;
            this.f30721b = textInputEditText;
            this.f30722c = textInputEditText2;
            this.f30723d = countryCodePicker;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z = false;
            if (charSequence == null || charSequence.length() == 0) {
                this.f30720a.setEnabled(jm7.m34047g(this.f30721b, this.f30722c, this.f30723d));
                return;
            }
            MaterialButton materialButton = this.f30720a;
            if (jm7.i0(this.f30722c.getText()) && jm7.m34047g(this.f30721b, this.f30722c, this.f30723d)) {
                z = true;
            }
            materialButton.setEnabled(z);
        }
    }

    /* renamed from: o.jm7$u */
    public static final class C14611u implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ MaterialButton f30724a;

        /* renamed from: b */
        public final /* synthetic */ TextInputEditText f30725b;

        /* renamed from: c */
        public final /* synthetic */ TextInputEditText f30726c;

        public C14611u(MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
            this.f30724a = materialButton;
            this.f30725b = textInputEditText;
            this.f30726c = textInputEditText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f30724a.setEnabled(jm7.m34046f(this.f30725b, this.f30726c));
        }
    }

    /* renamed from: o.jm7$v */
    public static final class C14612v implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ MaterialButton f30727a;

        /* renamed from: b */
        public final /* synthetic */ TextInputEditText f30728b;

        /* renamed from: c */
        public final /* synthetic */ TextInputEditText f30729c;

        public C14612v(MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
            this.f30727a = materialButton;
            this.f30728b = textInputEditText;
            this.f30729c = textInputEditText2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f30727a.setEnabled(jm7.m34046f(this.f30728b, this.f30729c));
        }
    }

    /* renamed from: A */
    public static final String m34015A(YearMonth yearMonth, boolean z) {
        sq8.m48649h(yearMonth, "<this>");
        Month month = yearMonth.getMonth();
        sq8.m48648g(month, "getMonth(...)");
        return m34066z(month, z) + " " + yearMonth.getYear();
    }

    public static /* synthetic */ void A0(MaterialButton materialButton, TextInputEditText textInputEditText, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        z0(materialButton, textInputEditText, str);
    }

    /* renamed from: B */
    public static /* synthetic */ String m34016B(DayOfWeek dayOfWeek, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m34065y(dayOfWeek, z);
    }

    public static final void B0(final MaterialButton materialButton, final TextInputEditText textInputEditText, final TextInputEditText textInputEditText2, final CountryCodePicker countryCodePicker) {
        sq8.m48649h(materialButton, "mButton");
        sq8.m48649h(textInputEditText, "mName");
        sq8.m48649h(textInputEditText2, "mEmail");
        sq8.m48649h(countryCodePicker, "mCpp");
        textInputEditText.addTextChangedListener(new C14609s(materialButton, textInputEditText, textInputEditText2, countryCodePicker));
        textInputEditText2.addTextChangedListener(new C14610t(materialButton, textInputEditText, textInputEditText2, countryCodePicker));
        countryCodePicker.setPhoneNumberValidityChangeListener(new CountryCodePicker.InterfaceC11554l() { // from class: o.fm7
            @Override // com.hbb20.CountryCodePicker.InterfaceC11554l
            /* renamed from: a */
            public final void mo15839a(boolean z) {
                jm7.C0(materialButton, textInputEditText, textInputEditText2, countryCodePicker, z);
            }
        });
    }

    /* renamed from: C */
    public static /* synthetic */ String m34017C(YearMonth yearMonth, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m34015A(yearMonth, z);
    }

    public static final void C0(MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, CountryCodePicker countryCodePicker, boolean z) {
        sq8.m48649h(materialButton, "$mButton");
        sq8.m48649h(textInputEditText, "$mName");
        sq8.m48649h(textInputEditText2, "$mEmail");
        sq8.m48649h(countryCodePicker, "$mCpp");
        materialButton.setEnabled(m34047g(textInputEditText, textInputEditText2, countryCodePicker));
    }

    /* renamed from: D */
    public static final int m34018D(Context context, int i) throws Resources.NotFoundException {
        sq8.m48649h(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i});
        sq8.m48648g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static final void D0(MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
        sq8.m48649h(materialButton, "mButton");
        sq8.m48649h(textInputEditText, "mName");
        sq8.m48649h(textInputEditText2, "mEmail");
        textInputEditText.addTextChangedListener(new C14611u(materialButton, textInputEditText, textInputEditText2));
        textInputEditText2.addTextChangedListener(new C14612v(materialButton, textInputEditText, textInputEditText2));
    }

    /* renamed from: E */
    public static final String m34019E(String str) {
        sq8.m48649h(str, "value");
        try {
            String str2 = DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm a").withZone(ZoneId.systemDefault()).format(Instant.parse(str));
            sq8.m48646e(str2);
            return str2;
        } catch (DateTimeParseException unused) {
            return str;
        }
    }

    /* renamed from: F */
    public static final ArrayList m34020F(Context context, int i, Long l, Long l2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String str = "getString(...)";
        sq8.m48649h(context, "context");
        if (!j4d.m33201H(context)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = context.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"number", "type", "date", "duration", "last_modified", "_id", "name", "photo_uri", "subscription_id"}, null, null, "_id DESC");
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("number");
                int columnIndex2 = cursorQuery.getColumnIndex("type");
                int columnIndex3 = cursorQuery.getColumnIndex("date");
                int columnIndex4 = cursorQuery.getColumnIndex("duration");
                int columnIndex5 = cursorQuery.getColumnIndex("_id");
                int columnIndex6 = cursorQuery.getColumnIndex("name");
                int columnIndex7 = cursorQuery.getColumnIndex("photo_uri");
                int columnIndex8 = cursorQuery.getColumnIndex("last_modified");
                Integer numValueOf = Integer.valueOf(cursorQuery.getColumnIndex("subscription_id"));
                gge ggeVar = new gge();
                int i2 = 0;
                while (cursorQuery.moveToNext() && t0(i, i2)) {
                    String string = cursorQuery.getString(columnIndex);
                    int i3 = columnIndex;
                    String string2 = cursorQuery.getString(columnIndex2);
                    sq8.m48648g(string2, str);
                    int i4 = columnIndex2;
                    String string3 = cursorQuery.getString(columnIndex3);
                    sq8.m48648g(string3, str);
                    int i5 = columnIndex3;
                    String string4 = cursorQuery.getString(columnIndex4);
                    sq8.m48648g(string4, str);
                    int i6 = columnIndex4;
                    String string5 = cursorQuery.getString(columnIndex5);
                    sq8.m48648g(string5, str);
                    String string6 = cursorQuery.getString(columnIndex6);
                    String string7 = cursorQuery.getString(columnIndex7);
                    String string8 = cursorQuery.getString(columnIndex8);
                    String str2 = str;
                    String string9 = numValueOf != null ? cursorQuery.getString(numValueOf.intValue()) : null;
                    if (string9 == null) {
                        string9 = "";
                    }
                    ggeVar.f25106a = string9;
                    if (!g0(string3, l, string4) && !f0(string3, l2, string4)) {
                        if (string != null) {
                            arrayList.add(new CallLogs(string5, string4, string2, string3, string, string8, string6, string7, th1.m49866r(e9g.m24593G(e9g.m24593G(string, "+91", "", false, 4, null), "+65", "", false, 4, null)), false, (String) ggeVar.f25106a, gv1.m29521a(string5, string2, string, string3), false, 4608, null));
                        }
                        i2++;
                        columnIndex = i3;
                        columnIndex2 = i4;
                        columnIndex3 = i5;
                        columnIndex4 = i6;
                        str = str2;
                    }
                }
                y3i y3iVar = y3i.f54824a;
                tb3.m49666a(cursorQuery, null);
            } finally {
            }
        }
        return arrayList;
    }

    /* renamed from: G */
    public static /* synthetic */ ArrayList m34021G(Context context, int i, Long l, Long l2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            l2 = null;
        }
        return m34020F(context, i, l, l2);
    }

    /* renamed from: H */
    public static final ArrayList m34022H(Context context) {
        sq8.m48649h(context, "context");
        String strM24488a = e7d.m24488a(context);
        String[] strArr = {"contact_id", "lookup", "has_phone_number", "display_name", "data1", "mimetype", "photo_uri"};
        String[] strArr2 = {"%@%", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2"};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Cursor cursorQuery = context.getContentResolver().query(ContactsContract.Data.CONTENT_URI, strArr, "mimetype = ? OR mimetype = ? OR mimetype = ?", strArr2, "display_name");
            if (cursorQuery != null && cursorQuery.getCount() > 0 && cursorQuery.moveToFirst()) {
                do {
                    int columnIndex = cursorQuery.getColumnIndex("has_phone_number");
                    int columnIndex2 = cursorQuery.getColumnIndex("display_name");
                    int columnIndex3 = cursorQuery.getColumnIndex("contact_id");
                    int columnIndex4 = cursorQuery.getColumnIndex("data1");
                    int columnIndex5 = cursorQuery.getColumnIndex("photo_uri");
                    int i = cursorQuery.getInt(columnIndex);
                    int i2 = cursorQuery.getInt(columnIndex3);
                    String string = cursorQuery.getString(columnIndex2);
                    String string2 = cursorQuery.getString(columnIndex4);
                    String string3 = cursorQuery.getString(columnIndex5);
                    if (string3 != null) {
                        string3 = "content://com.android.contacts/contacts/" + i2 + "/photo";
                    }
                    if (i > 0 && string2 != null) {
                        if (linkedHashMap.containsKey(Integer.valueOf(i2))) {
                            UserContactDetail userContactDetail = (UserContactDetail) linkedHashMap.get(Integer.valueOf(i2));
                            if (userContactDetail != null) {
                                if (i0(string2)) {
                                    userContactDetail.getEmailId().addAll(Collections.singletonList(string2));
                                } else {
                                    String strM24493f = e7d.m24493f(string2, strM24488a);
                                    if (strM24493f != null) {
                                        userContactDetail.getPhoneNumber().addAll(Collections.singletonList(strM24493f));
                                    }
                                }
                                if (string == null) {
                                    string = "";
                                }
                                userContactDetail.setName(string);
                                linkedHashMap.put(Integer.valueOf(i2), userContactDetail);
                            }
                        } else {
                            UserContactDetail userContactDetail2 = new UserContactDetail(null, null, null, null, false, false, null, null, Constants.MAX_HOST_LENGTH, null);
                            userContactDetail2.setId(String.valueOf(i2));
                            if (i0(string2)) {
                                userContactDetail2.getEmailId().addAll(Collections.singletonList(string2));
                            } else {
                                String strM24493f2 = e7d.m24493f(string2, strM24488a);
                                if (strM24493f2 != null) {
                                    userContactDetail2.getPhoneNumber().addAll(Collections.singletonList(strM24493f2));
                                }
                            }
                            if (string == null) {
                                string = "";
                            }
                            userContactDetail2.setName(string);
                            if (string3 == null) {
                                string3 = "";
                            }
                            userContactDetail2.setPhotoUri(string3);
                            linkedHashMap.put(Integer.valueOf(i2), userContactDetail2);
                        }
                    }
                } while (cursorQuery.moveToNext());
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((UserContactDetail) ((Map.Entry) it.next()).getValue());
        }
        List listC0 = kh3.c0(arrayList);
        sq8.m48647f(listC0, "null cannot be cast to non-null type java.util.ArrayList<ai.salesmax.model.UserContactDetail>{ kotlin.collections.TypeAliasesKt.ArrayList<ai.salesmax.model.UserContactDetail> }");
        return (ArrayList) listC0;
    }

    /* renamed from: I */
    public static final String[] m34023I(String str) {
        sq8.m48649h(str, "category");
        String[] strArr = new String[0];
        switch (str.hashCode()) {
            case 2656393:
                return !str.equals("WABA") ? strArr : new String[]{"image/jpeg", "image/png", "image/webp", "video/mp4", "video/3gpp", "audio/aac", "audio/mp4", "audio/mpeg", "audio/amr", "audio/ogg", HTTP.PLAIN_TEXT_TYPE, "application/pdf", "application/vnd.ms-powerpoint", "application/msword", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"};
            case 62628790:
                return !str.equals("AUDIO") ? strArr : new String[]{"audio/aac", "audio/mp4", "audio/mpeg", "audio/amr", "audio/ogg"};
            case 69775675:
                return !str.equals("IMAGE") ? strArr : new String[]{"image/jpeg", "image/png", "image/webp"};
            case 81665115:
                return !str.equals("VIDEO") ? strArr : new String[]{"video/mp4", "video/3gpp"};
            case 1294604375:
                return !str.equals("IMAGE_VIDEO") ? strArr : new String[]{"image/jpeg", "image/png", "image/webp", "video/mp4", "video/3gpp"};
            case 1644347675:
                return !str.equals("DOCUMENT") ? strArr : new String[]{HTTP.PLAIN_TEXT_TYPE, "application/pdf", "application/vnd.ms-powerpoint", "application/msword", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"};
            default:
                return strArr;
        }
    }

    /* renamed from: J */
    public static final String m34024J(long j, View view) {
        sq8.m48649h(view, "view");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(5, -1);
        if (calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5)) {
            return DateFormat.format("h:mm a", calendar).toString();
        }
        if (calendar3.get(1) != calendar.get(1) || calendar3.get(2) != calendar.get(2) || calendar3.get(5) != calendar.get(5)) {
            return DateFormat.format("dd/MMM/yyyy", calendar).toString();
        }
        String string = view.getContext().getString(hae.yesterday);
        sq8.m48646e(string);
        return string;
    }

    /* renamed from: K */
    public static final String m34025K(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(5, -1);
        return (calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5)) ? "Today" : (calendar3.get(1) == calendar.get(1) && calendar3.get(2) == calendar.get(2) && calendar3.get(5) == calendar.get(5)) ? "Yesterday" : (calendar2.get(3) == calendar.get(3) && calendar2.get(1) == calendar.get(1)) ? "Earlier This Week" : (calendar2.get(2) == calendar.get(2) && calendar2.get(1) == calendar.get(1)) ? "Earlier This Month" : (calendar2.get(2) == calendar.get(2) + 1 && calendar2.get(1) == calendar.get(1)) ? "Last Month" : calendar2.get(1) == calendar.get(1) ? "Earlier This Year" : "Older";
    }

    /* renamed from: L */
    public static final String m34026L(long j, View view) {
        sq8.m48649h(view, "view");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar.getInstance();
        return DateFormat.format("dd/MM/yyyy hh:mm a", calendar).toString();
    }

    /* renamed from: M */
    public static final String m34027M(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd HH:mm:ss", calendar).toString();
    }

    /* renamed from: N */
    public static final String m34028N(String str) {
        String str2;
        sq8.m48649h(str, "activityType");
        switch (str.hashCode()) {
            case -1583748127:
                str2 = "TASK_UPDATED";
                break;
            case -1017263119:
                str2 = "TASK_COMPLETED";
                break;
            case -1011516650:
                return !str.equals("VISIT_LOGGED") ? "TASK" : "VISIT";
            case -895108100:
                return !str.equals("CALL_RECORD_AVAILABLE") ? "TASK" : "CALL";
            case -320763378:
                str2 = "TASK_CREATED";
                break;
            case -25822595:
                return !str.equals("WHATSAPP_MESSAGE_SENT") ? "TASK" : "WHATSAPP";
            case 21343875:
                return !str.equals("CALL_LOGGED") ? "TASK" : "CALL";
            case 709171934:
                return !str.equals("SMS_SENT") ? "TASK" : "SMS";
            case 750937928:
                str2 = "TASK_ASSIGNED";
                break;
            case 759150163:
                return !str.equals("NOTE_ADDED") ? "TASK" : "NOTE";
            case 1149502629:
                return !str.equals("CONVERSATION_STARTED") ? "TASK" : "CONVERSATION";
            case 1833302651:
                return !str.equals("EMAIL_SENT") ? "TASK" : "EMAIL";
            case 1947337367:
                return !str.equals("CALL_DISPOSITION_ADDED") ? "TASK" : "CALL";
            default:
                return "TASK";
        }
        str.equals(str2);
        return "TASK";
    }

    /* renamed from: O */
    public static final String m34029O(String str) {
        sq8.m48649h(str, "notificationType");
        if (sq8.m48644c(str, "TASK_REMINDER")) {
            return "TASK";
        }
        sq8.m48644c(str, "TASK_ASSIGNMENT");
        return "TASK";
    }

    /* renamed from: P */
    public static final long m34030P(ContentResolver contentResolver, Uri uri) {
        sq8.m48649h(contentResolver, "resolver");
        sq8.m48649h(uri, "uri");
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return 0L;
        }
        long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
        cursorQuery.close();
        return j;
    }

    /* renamed from: Q */
    public static final String m34031Q(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return DateFormat.format("dd/MMM/yyyy", calendar).toString();
    }

    /* renamed from: R */
    public static final String m34032R(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return DateFormat.format("hh:mm aa", calendar).toString();
    }

    /* renamed from: S */
    public static final String m34033S(String str) {
        if (str == null) {
            return null;
        }
        try {
            String host = new URI(new URL(str).toURI().toASCIIString()).getHost();
            if (host == null) {
                host = "";
            }
            if (!(host.length() > 0) || !e9g.m24597K(host, "www.", false, 2, null)) {
                return host;
            }
            String strSubstring = host.substring(4);
            sq8.m48648g(strSubstring, "substring(...)");
            return strSubstring;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: T */
    public static final long m34034T(long j) {
        return m34061u(j - (j % 86400000));
    }

    /* renamed from: U */
    public static final long m34035U(long j) {
        return m34034T(m34059s(j));
    }

    /* renamed from: V */
    public static final long m34036V(long j) {
        return m34059s(j) % 86400000;
    }

    /* renamed from: W */
    public static final ArrayList m34037W() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReminderData("None", 0, false, 6, null));
        arrayList.add(new ReminderData("At Task due time", 0, false, 4, null));
        arrayList.add(new ReminderData("10 minutes before", 1, false, 4, null));
        arrayList.add(new ReminderData("30 minutes before", 2, false, 4, null));
        arrayList.add(new ReminderData("1 hour before", 3, false, 4, null));
        arrayList.add(new ReminderData("1 day before", 4, false, 4, null));
        arrayList.add(new ReminderData("1 week before", 5, false, 4, null));
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a A[RETURN] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m34038X(ReminderData reminderData) {
        sq8.m48649h(reminderData, "reminder");
        String name = reminderData.getName();
        switch (name.hashCode()) {
            case 325393362:
                return !name.equals("1 day before") ? 0L : 86400000L;
            case 383073795:
                if (name.equals("30 minutes before")) {
                    return 1800000L;
                }
                break;
            case 1431827404:
                if (name.equals("1 hour before")) {
                    return 3600000L;
                }
                break;
            case 1543128199:
                name.equals("At Task due time");
                return 0L;
            case 1752225724:
                if (name.equals("1 week before")) {
                    return 604800000L;
                }
                break;
            case 1971421697:
                if (name.equals("10 minutes before")) {
                    return 600000L;
                }
                break;
        }
    }

    /* renamed from: Y */
    public static final String m34039Y(long j) {
        if (j == 0) {
            return "At Task due time";
        }
        if (j == 600000) {
            return "10 minutes before";
        }
        if (j == 1800000) {
            return "30 minutes before";
        }
        if (j == 3600000) {
            return "1 hour before";
        }
        if (j == 86400000) {
            return "1 day before";
        }
        if (j == 604800000) {
            return "1 week before";
        }
        return null;
    }

    /* renamed from: Z */
    public static final String m34040Z(View view, double d, double d2, int i, int i2, int i3) {
        sq8.m48649h(view, "view");
        String string = view.getContext().getString(hae.google_maps_key);
        sq8.m48648g(string, "getString(...)");
        return "https://maps.googleapis.com/maps/api/staticmap?center=" + d + "," + d2 + "&zoom=" + i3 + "&size=" + i + "x" + i2 + "&maptype=roadmap&markers=color:red|label:A|" + d + "," + d2 + "&key=" + string;
    }

    public static final String b0(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < 60000) {
            return "moments ago";
        }
        if (jCurrentTimeMillis < 120000) {
            return "a minute ago";
        }
        if (jCurrentTimeMillis < 3600000) {
            return (jCurrentTimeMillis / 60000) + " minutes ago";
        }
        if (jCurrentTimeMillis < 7200000) {
            return "an hour ago";
        }
        if (jCurrentTimeMillis < 86400000) {
            return (jCurrentTimeMillis / 3600000) + " hours ago";
        }
        if (jCurrentTimeMillis < 172800000) {
            return "one day ago";
        }
        return (jCurrentTimeMillis / 86400000) + " days ago";
    }

    public static final String c0(long j, View view) {
        sq8.m48649h(view, "view");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.getTime();
        return DateFormat.format("hh:mm a", calendar).toString();
    }

    public static final String d0(long j) {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd HH:mm:ss", calendar).toString();
    }

    public static final String e0(s6j s6jVar) {
        sq8.m48649h(s6jVar, "week");
        LocalDate localDateM16579a = ((a7j) kh3.f0(s6jVar.m47918a())).m16579a();
        LocalDate localDateM16579a2 = ((a7j) kh3.r0(s6jVar.m47918a())).m16579a();
        if (sq8.m48644c(yp6.m58063g(localDateM16579a), yp6.m58063g(localDateM16579a2))) {
            return m34017C(yp6.m58063g(localDateM16579a), false, 1, null);
        }
        if (localDateM16579a.getYear() != localDateM16579a2.getYear()) {
            return m34017C(yp6.m58063g(localDateM16579a), false, 1, null) + " - " + m34017C(yp6.m58063g(localDateM16579a2), false, 1, null);
        }
        Month month = localDateM16579a.getMonth();
        sq8.m48648g(month, "getMonth(...)");
        return m34066z(month, false) + " - " + m34017C(yp6.m58063g(localDateM16579a2), false, 1, null);
    }

    /* renamed from: f */
    public static final boolean m34046f(TextInputEditText textInputEditText, TextInputEditText textInputEditText2) {
        sq8.m48649h(textInputEditText, "mName");
        sq8.m48649h(textInputEditText2, "mEmail");
        Editable text = textInputEditText.getText();
        sq8.m48646e(text);
        return !(text.length() == 0) && i0(textInputEditText2.getText());
    }

    public static final boolean f0(String str, Long l, String str2) {
        if (l != null && str != null) {
            if (Long.parseLong(str) - ((str2 != null ? Long.parseLong(str2) : 0L) * 1000) > l.longValue() - DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m34047g(TextInputEditText textInputEditText, TextInputEditText textInputEditText2, CountryCodePicker countryCodePicker) {
        sq8.m48649h(textInputEditText, "mName");
        sq8.m48649h(textInputEditText2, "mEmail");
        sq8.m48649h(countryCodePicker, "mCpp");
        Editable text = textInputEditText.getText();
        sq8.m48646e(text);
        return !(text.length() == 0) && (countryCodePicker.m15835w() || i0(textInputEditText2.getText()));
    }

    public static final boolean g0(String str, Long l, String str2) {
        if (l != null && str != null) {
            if (Long.parseLong(str) < (l.longValue() - ((str2 != null ? Long.parseLong(str2) : 0L) * 1000)) - DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final void m34048h(Leads leads, Activity activity, AtomicReference atomicReference) {
        String strM34062v;
        sq8.m48649h(leads, "leads");
        sq8.m48649h(activity, "activity");
        sq8.m48649h(atomicReference, "customAttributesReadable");
        Intent intent = new Intent("android.intent.action.SEND");
        List listM21249n = ch3.m21249n(vyh.m53620a("Salutation", leads.getSalutation()), vyh.m53620a("First Name", leads.getFirstName()), vyh.m53620a("Last Name", leads.getLastName()), vyh.m53620a("Name", leads.getName()), vyh.m53620a("Phone Numbers", kh3.p0(leads.getPhoneNumbers(), ", ", null, null, 0, null, null, 62, null)), vyh.m53620a("Emails", kh3.p0(leads.getEmails(), ", ", null, null, 0, null, null, 62, null)), vyh.m53620a("Address", leads.getContactLocation()), vyh.m53620a("Designation", leads.getDesignation()), vyh.m53620a("Company", leads.getCompany()), vyh.m53620a("Contact Source", leads.getContactSource()), vyh.m53620a("Contact Source - Drill Down 1", leads.getContactSourceOne()), vyh.m53620a("Contact Source  - Drill Down 2", leads.getContactSourceTwo()), vyh.m53620a("Contact Source  - Drill Down 3", leads.getContactSourceThree()));
        StringBuilder sb = new StringBuilder();
        Iterator it = listM21249n.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            hwc hwcVar = (hwc) it.next();
            String str = (String) hwcVar.m31227a();
            String str2 = (String) hwcVar.m31228b();
            if (!(str2 == null || f9g.d0(str2))) {
                sb.append(str + ": " + str2 + "\n");
            }
        }
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        String string2 = f9g.Z0(string).toString();
        String str3 = (String) atomicReference.get();
        if (str3 != null && (strM34062v = m34062v(str3)) != null) {
            string2 = ((Object) string2) + "\n" + strM34062v;
        }
        if (string2.length() > 0) {
            string2 = ((Object) string2) + "\n\nSent From : https://salesmax.ai/";
        }
        intent.putExtra("android.intent.extra.TEXT", string2);
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        activity.startActivity(Intent.createChooser(intent, null));
    }

    public static final boolean h0(String str) {
        sq8.m48649h(str, "toCheck");
        return c9g.m20528j(str) != null;
    }

    /* renamed from: i */
    public static final void m34049i(String str, int i, Context context, Leads leads) {
        sq8.m48649h(str, "number");
        sq8.m48649h(context, "activity");
        uni.LB().d0(C14594d.f30689a).w0(new C14595e(str, i, leads), C14596f.f30693a, new jm() { // from class: o.im7
            @Override // p001o.jm
            public final void run() {
                jm7.m34054n();
            }
        });
    }

    public static final boolean i0(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    /* renamed from: j */
    public static final void m34050j(String str, Context context, Leads leads) {
        sq8.m48649h(str, "number");
        sq8.m48649h(context, "activity");
        uni.LB().d0(C14591a.f30685a).w0(new C14592b(str, leads), C14593c.f30688a, new jm() { // from class: o.em7
            @Override // p001o.jm
            public final void run() {
                jm7.m34053m();
            }
        });
    }

    public static final void j0(Context context, String str) {
        URL urlM29295n;
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "uri");
        if (!f9g.m26306P(str, HttpHost.DEFAULT_SCHEME_NAME, false, 2, null) && (urlM29295n = gq9.m29295n(str)) != null) {
            str = urlM29295n.toString();
            sq8.m48648g(str, "toString(...)");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        context.startActivity(intent);
    }

    /* renamed from: k */
    public static /* synthetic */ void m34051k(String str, int i, Context context, Leads leads, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            leads = null;
        }
        m34049i(str, i, context, leads);
    }

    public static final String k0(ContentResolver contentResolver, Uri uri) {
        sq8.m48649h(contentResolver, "resolver");
        sq8.m48649h(uri, "uri");
        Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        int columnIndex = cursorQuery.getColumnIndex("_display_name");
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(columnIndex);
        cursorQuery.close();
        return string;
    }

    /* renamed from: l */
    public static /* synthetic */ void m34052l(String str, Context context, Leads leads, int i, Object obj) {
        if ((i & 4) != 0) {
            leads = null;
        }
        m34050j(str, context, leads);
    }

    public static final void l0(List list, Predicate predicate) {
        sq8.m48649h(list, "list");
        sq8.m48649h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (predicate.test(obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove(it.next());
        }
    }

    /* renamed from: m */
    public static final void m34053m() {
    }

    public static final void m0(String str, Activity activity) {
        sq8.m48649h(str, "number");
        sq8.m48649h(activity, "activity");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "Your text");
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        activity.startActivity(Intent.createChooser(intent, "Send message"));
    }

    /* renamed from: n */
    public static final void m34054n() {
    }

    public static final void n0(Spannable spannable, ArrayList arrayList, ck6 ck6Var) {
        sq8.m48649h(spannable, "spannable");
        sq8.m48649h(arrayList, "paths");
        sq8.m48649h(ck6Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String string = spannable.toString();
            Object obj = arrayList.get(i);
            sq8.m48648g(obj, "get(...)");
            int iB0 = f9g.b0(string, (String) obj, 0, false, 6, null);
            if (iB0 != -1) {
                spannable.setSpan(new C14601k(ck6Var, i, arrayList), iB0, ((String) arrayList.get(i)).length() + iB0, 33);
            }
        }
    }

    /* renamed from: o */
    public static final void m34055o(String str, Activity activity, Leads leads, String str2, xk7 xk7Var) {
        sq8.m48649h(str, "number");
        sq8.m48649h(activity, "activity");
        sq8.m48649h(xk7Var, "callback");
        dc3.f19548a.m22797a().m22785n(str, leads, xk7Var);
    }

    public static final Spannable o0(String str, ArrayList arrayList, boolean z, boolean z2) {
        sq8.m48649h(str, "fullLengthText");
        sq8.m48649h(arrayList, "paths");
        SpannableString spannableString = new SpannableString(str);
        StyleSpan styleSpan = new StyleSpan(1);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) ((hwc) arrayList.get(i)).m31229c();
            int iIntValue = ((Number) ((hwc) arrayList.get(i)).m31230d()).intValue();
            String string = spannableString.toString();
            sq8.m48648g(string, "toString(...)");
            int iM26314X = f9g.m26314X(string, str2, 0, true);
            if (iM26314X != -1) {
                if (z) {
                    spannableString.setSpan(new UnderlineSpan(), iM26314X, str2.length() + iM26314X, 33);
                }
                if (z2) {
                    spannableString.setSpan(styleSpan, iM26314X, str2.length() + iM26314X, 18);
                }
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), iM26314X, str2.length() + iM26314X, 33);
            }
        }
        return spannableString;
    }

    /* renamed from: p */
    public static /* synthetic */ void m34056p(String str, Activity activity, Leads leads, String str2, xk7 xk7Var, int i, Object obj) {
        if ((i & 4) != 0) {
            leads = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            xk7Var = C14597g.f30694a;
        }
        m34055o(str, activity, leads, str2, xk7Var);
    }

    public static /* synthetic */ Spannable p0(String str, ArrayList arrayList, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return o0(str, arrayList, z, z2);
    }

    /* renamed from: q */
    public static final void m34057q(String str, Activity activity) {
        sq8.m48649h(str, "number");
        sq8.m48649h(activity, "activity");
        uni.LB().d0(C14598h.f30695a).w0(new C14599i(str), C14600j.f30697a, new jm() { // from class: o.hm7
            @Override // p001o.jm
            public final void run() {
                jm7.m34058r();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q0(final Leads leads, final Activity activity) {
        String strM166k;
        sq8.m48649h(leads, "lead");
        sq8.m48649h(activity, "activity");
        final gge ggeVar = new gge();
        ggeVar.f25106a = new AtomicReference(null);
        if (leads.getCustomAttributes() == null) {
            CustomFormDataObservable customAttributesObservable = leads.getCustomAttributesObservable();
            if (customAttributesObservable != null && (strM166k = customAttributesObservable.m166k()) != null) {
                ((AtomicReference) ggeVar.f25106a).set(strM166k);
            }
            m34048h(leads, activity, (AtomicReference) ggeVar.f25106a);
        } else {
            CustomFormDataObservable customAttributesObservable2 = leads.getCustomAttributesObservable();
            if ((customAttributesObservable2 != null ? customAttributesObservable2.m166k() : null) == null) {
                PropertyDefinitionRepository propertyDefinitionRepositoryO0 = PropertyDefinitionRepository.o0();
                String customAttributes = leads.getCustomAttributes();
                sq8.m48646e(customAttributes);
                x6c x6cVarP1 = propertyDefinitionRepositoryO0.p1(customAttributes);
                x6cVarP1.w0(new C14602l(ggeVar, x6cVarP1), new C14603m(leads, activity, ggeVar), new jm() { // from class: o.gm7
                    @Override // p001o.jm
                    public final void run() {
                        jm7.s0(leads, activity, ggeVar);
                    }
                });
            }
        }
        m34048h(leads, activity, (AtomicReference) ggeVar.f25106a);
    }

    /* renamed from: r */
    public static final void m34058r() {
    }

    public static final void r0(String str, String str2, Activity activity) {
        sq8.m48649h(str2, "number");
        sq8.m48649h(activity, "activity");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (str == null || f9g.d0(str)) {
            intent.putExtra("android.intent.extra.TEXT", "Contact name :" + str + "\nContact number:" + str2);
        } else {
            intent.putExtra("android.intent.extra.TEXT", "Contact number:" + str2);
        }
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        activity.startActivity(Intent.createChooser(intent, null));
    }

    /* renamed from: s */
    public static final long m34059s(long j) throws ParseException {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("UTC");
        sq8.m48648g(timeZone, "getTimeZone(...)");
        String strM34027M = m34027M(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        Date date = simpleDateFormat.parse(strM34027M);
        return date != null ? date.getTime() : j;
    }

    public static final void s0(Leads leads, Activity activity, gge ggeVar) {
        sq8.m48649h(leads, "$lead");
        sq8.m48649h(activity, "$activity");
        sq8.m48649h(ggeVar, "$customAttributesReadable");
        m34048h(leads, activity, (AtomicReference) ggeVar.f25106a);
    }

    /* renamed from: t */
    public static final List m34060t(List list) {
        sq8.m48649h(list, "dataList");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityLocation activityLocation = (ActivityLocation) it.next();
            String ownerId = activityLocation.getOwnerId();
            sq8.m48648g(ownerId, "getOwnerId(...)");
            String lat = activityLocation.getLat();
            sq8.m48648g(lat, "getLat(...)");
            Double dValueOf = Double.valueOf(Double.parseDouble(lat));
            String lng = activityLocation.getLng();
            sq8.m48648g(lng, "getLng(...)");
            arrayList.add(new UserLocation(ownerId, dValueOf, Double.valueOf(Double.parseDouble(lng)), a81.m16645F(activityLocation.getCreatedAt())));
        }
        return arrayList;
    }

    public static final boolean t0(int i, int i2) {
        return i < 0 || i2 < i;
    }

    /* renamed from: u */
    public static final long m34061u(long j) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(d0(j));
        return date != null ? date.getTime() : j;
    }

    public static final Snackbar u0(Activity activity, String str, int i, int i2) {
        Activity activity2 = (Activity) new WeakReference(activity).get();
        if (activity2 == null || str == null) {
            return null;
        }
        View viewFindViewById = activity2.getWindow().getDecorView().findViewById(R.id.content);
        sq8.m48648g(viewFindViewById, "findViewById(...)");
        Snackbar snackbarL0 = Snackbar.l0(viewFindViewById, str, i);
        View viewM15146G = snackbarL0.m15146G();
        sq8.m48648g(viewM15146G, "getView(...)");
        viewM15146G.setElevation(25.0f);
        if (viewM15146G.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = viewM15146G.getLayoutParams();
            sq8.m48647f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i2;
            layoutParams2.topMargin = 100;
            viewM15146G.setLayoutParams(layoutParams2);
        }
        snackbarL0.mo15162W();
        return snackbarL0;
    }

    /* renamed from: v */
    public static final String m34062v(String str) {
        sq8.m48649h(str, "input");
        if (StringUtils.isBlank(str)) {
            return "";
        }
        JsonElement string = JsonParser.parseString(str);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, JsonElement> entry : string.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            sb.append(key + ": ");
            if (!value.isJsonNull()) {
                if (value.isJsonArray()) {
                    Iterator<JsonElement> it = value.getAsJsonArray().iterator();
                    while (it.hasNext()) {
                        JsonElement next = it.next();
                        sq8.m48648g(next, "next(...)");
                        JsonElement jsonElement = next;
                        if (!jsonElement.isJsonNull()) {
                            if (!jsonElement.isJsonPrimitive()) {
                                sb.append(jsonElement + "\n");
                            } else if (jsonElement.getAsJsonPrimitive().isNumber()) {
                                sb.append(jsonElement.getAsJsonPrimitive().getAsNumber() + "\n");
                            } else if (jsonElement.getAsJsonPrimitive().isString()) {
                                sb.append(jsonElement.getAsJsonPrimitive().getAsString() + "\n");
                            }
                        }
                    }
                } else if (value.isJsonPrimitive()) {
                    if (value.getAsJsonPrimitive().isNumber()) {
                        sb.append(value.getAsJsonPrimitive().getAsNumber() + "\n");
                    } else if (value.getAsJsonPrimitive().isString()) {
                        sb.append(value.getAsJsonPrimitive().getAsString() + "\n");
                    }
                } else if (value.isJsonObject()) {
                    sb.append(value + "\n");
                } else {
                    sb.append(value + "\n");
                }
            }
        }
        if ((sb.length() > 0) && h9g.i1(sb) == '\n') {
            String string2 = sb.deleteCharAt(sb.length() - 1).toString();
            sq8.m48646e(string2);
            return string2;
        }
        String string3 = sb.toString();
        sq8.m48646e(string3);
        return string3;
    }

    public static /* synthetic */ Snackbar v0(Activity activity, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = 48;
        }
        return u0(activity, str, i, i2);
    }

    /* renamed from: w */
    public static final SpannableStringBuilder m34063w(String str) {
        sq8.m48649h(str, "input");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!f9g.d0(str)) {
            for (Map.Entry<String, JsonElement> entry : JsonParser.parseString(str).getAsJsonObject().entrySet()) {
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) (key + ": "));
                spannableStringBuilder.setSpan(new StyleSpan(1), length, spannableStringBuilder.length(), 33);
                if (!value.isJsonNull()) {
                    if (value.isJsonArray()) {
                        Iterator<JsonElement> it = value.getAsJsonArray().iterator();
                        while (it.hasNext()) {
                            JsonElement next = it.next();
                            sq8.m48648g(next, "next(...)");
                            JsonElement jsonElement = next;
                            if (!jsonElement.isJsonNull()) {
                                if (!jsonElement.isJsonPrimitive()) {
                                    spannableStringBuilder.append((CharSequence) (jsonElement + "\n"));
                                } else if (jsonElement.getAsJsonPrimitive().isNumber()) {
                                    spannableStringBuilder.append((CharSequence) (jsonElement.getAsJsonPrimitive().getAsNumber() + "\n"));
                                } else if (jsonElement.getAsJsonPrimitive().isString()) {
                                    String asString = jsonElement.getAsJsonPrimitive().getAsString();
                                    sq8.m48648g(asString, "getAsString(...)");
                                    spannableStringBuilder.append((CharSequence) (m34019E(asString) + "\n"));
                                }
                            }
                        }
                    } else if (value.isJsonPrimitive()) {
                        if (value.getAsJsonPrimitive().isNumber()) {
                            spannableStringBuilder.append((CharSequence) (value.getAsJsonPrimitive().getAsNumber() + "\n"));
                        } else if (value.getAsJsonPrimitive().isString()) {
                            String asString2 = value.getAsJsonPrimitive().getAsString();
                            sq8.m48648g(asString2, "getAsString(...)");
                            spannableStringBuilder.append((CharSequence) (m34019E(asString2) + "\n"));
                        }
                    } else if (value.isJsonObject()) {
                        spannableStringBuilder.append((CharSequence) (value + "\n"));
                    } else {
                        spannableStringBuilder.append((CharSequence) (value + "\n"));
                    }
                }
            }
            if ((spannableStringBuilder.length() > 0) && h9g.i1(spannableStringBuilder) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
        }
        return spannableStringBuilder;
    }

    public static final void w0(MaterialButton materialButton, TextInputEditText textInputEditText, String str) {
        sq8.m48649h(materialButton, "mButton");
        sq8.m48649h(textInputEditText, "edittext");
        textInputEditText.addTextChangedListener(new C14604n(str, materialButton));
    }

    /* renamed from: x */
    public static final void m34064x(String str, Activity activity) {
        sq8.m48649h(str, "number");
        sq8.m48649h(activity, "activity");
        activity.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)));
    }

    public static /* synthetic */ void x0(MaterialButton materialButton, TextInputEditText textInputEditText, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        w0(materialButton, textInputEditText, str);
    }

    /* renamed from: y */
    public static final String m34065y(DayOfWeek dayOfWeek, boolean z) {
        sq8.m48649h(dayOfWeek, "<this>");
        TextStyle textStyle = TextStyle.SHORT;
        Locale locale = Locale.ENGLISH;
        String displayName = dayOfWeek.getDisplayName(textStyle, locale);
        if (z) {
            sq8.m48646e(displayName);
            sq8.m48648g(locale, "ENGLISH");
            displayName = displayName.toUpperCase(locale);
            sq8.m48648g(displayName, "toUpperCase(...)");
        }
        sq8.m48648g(displayName, "let(...)");
        return displayName;
    }

    public static final TextInputLayout y0(TextInputEditText textInputEditText, TextInputLayout textInputLayout, String str, String str2) {
        sq8.m48649h(textInputEditText, "edittext");
        sq8.m48649h(textInputLayout, "mTextInputLayout");
        sq8.m48649h(str, "type");
        sq8.m48649h(str2, "msg");
        int iHashCode = str.hashCode();
        if (iHashCode != 2603341) {
            if (iHashCode != 67066748) {
                if (iHashCode == 77090126 && str.equals("Phone")) {
                    textInputEditText.addTextChangedListener(new C14605o(textInputLayout, str2));
                }
            } else if (str.equals("Email")) {
                textInputEditText.addTextChangedListener(new C14606p(textInputLayout, str2));
            }
        } else if (str.equals("Text")) {
            textInputEditText.addTextChangedListener(new C14607q(textInputLayout, str2));
        }
        return textInputLayout;
    }

    /* renamed from: z */
    public static final String m34066z(Month month, boolean z) {
        sq8.m48649h(month, "<this>");
        String displayName = month.getDisplayName(z ? TextStyle.SHORT : TextStyle.FULL, Locale.ENGLISH);
        sq8.m48648g(displayName, "getDisplayName(...)");
        return displayName;
    }

    public static final void z0(MaterialButton materialButton, TextInputEditText textInputEditText, String str) {
        sq8.m48649h(materialButton, "mButton");
        sq8.m48649h(textInputEditText, "edittext");
        textInputEditText.addTextChangedListener(new C14608r(materialButton, str));
    }
}
