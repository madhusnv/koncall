package p001o;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hbb20.C11556a;
import com.hbb20.CountryCodePicker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public class s84 extends RecyclerView.AbstractC2371h implements vaf {

    /* renamed from: a */
    public List f44934a;

    /* renamed from: b */
    public List f44935b;

    /* renamed from: c */
    public TextView f44936c;

    /* renamed from: d */
    public CountryCodePicker f44937d;

    /* renamed from: e */
    public LayoutInflater f44938e;

    /* renamed from: f */
    public EditText f44939f;

    /* renamed from: g */
    public Dialog f44940g;

    /* renamed from: h */
    public Context f44941h;

    /* renamed from: i */
    public RelativeLayout f44942i;

    /* renamed from: j */
    public ImageView f44943j;

    /* renamed from: k */
    public int f44944k = 0;

    /* renamed from: o.s84$a */
    public class ViewOnClickListenerC16774a implements View.OnClickListener {
        public ViewOnClickListenerC16774a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s84.this.f44939f.setText("");
        }
    }

    /* renamed from: o.s84$b */
    public class C16775b implements TextWatcher {
        public C16775b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            s84.this.m47981e(charSequence.toString());
            if (charSequence.toString().trim().equals("")) {
                s84.this.f44943j.setVisibility(8);
            } else {
                s84.this.f44943j.setVisibility(0);
            }
        }
    }

    /* renamed from: o.s84$c */
    public class C16776c implements TextView.OnEditorActionListener {
        public C16776c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            ((InputMethodManager) s84.this.f44941h.getSystemService("input_method")).hideSoftInputFromWindow(s84.this.f44939f.getWindowToken(), 0);
            return true;
        }
    }

    /* renamed from: o.s84$d */
    public class ViewOnClickListenerC16777d implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ int f44948a;

        public ViewOnClickListenerC16777d(int i) {
            this.f44948a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list;
            List list2 = s84.this.f44934a;
            if (list2 != null) {
                int size = list2.size();
                int i = this.f44948a;
                if (size > i) {
                    s84 s84Var = s84.this;
                    s84Var.f44937d.m15802A((C11556a) s84Var.f44934a.get(i));
                }
            }
            if (view == null || (list = s84.this.f44934a) == null) {
                return;
            }
            int size2 = list.size();
            int i2 = this.f44948a;
            if (size2 <= i2 || s84.this.f44934a.get(i2) == null) {
                return;
            }
            ((InputMethodManager) s84.this.f44941h.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            s84.this.f44940g.dismiss();
        }
    }

    /* renamed from: o.s84$e */
    public class C16778e extends RecyclerView.d0 {

        /* renamed from: u */
        public RelativeLayout f44951u;

        /* renamed from: v */
        public TextView f44952v;

        /* renamed from: w */
        public TextView f44953w;

        /* renamed from: x */
        public ImageView f44954x;

        /* renamed from: y */
        public LinearLayout f44955y;

        /* renamed from: z */
        public View f44956z;

        public C16778e(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            this.f44951u = relativeLayout;
            this.f44952v = (TextView) relativeLayout.findViewById(o8e.textView_countryName);
            this.f44953w = (TextView) this.f44951u.findViewById(o8e.textView_code);
            this.f44954x = (ImageView) this.f44951u.findViewById(o8e.image_flag);
            this.f44955y = (LinearLayout) this.f44951u.findViewById(o8e.linear_flag_holder);
            this.f44956z = this.f44951u.findViewById(o8e.preferenceDivider);
            if (s84.this.f44937d.getDialogTextColor() != 0) {
                this.f44952v.setTextColor(s84.this.f44937d.getDialogTextColor());
                this.f44953w.setTextColor(s84.this.f44937d.getDialogTextColor());
                this.f44956z.setBackgroundColor(s84.this.f44937d.getDialogTextColor());
            }
            if (s84.this.f44937d.getCcpDialogRippleEnable()) {
                TypedValue typedValue = new TypedValue();
                s84.this.f44941h.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
                int i = typedValue.resourceId;
                if (i != 0) {
                    this.f44951u.setBackgroundResource(i);
                } else {
                    this.f44951u.setBackgroundResource(typedValue.data);
                }
            }
            try {
                if (s84.this.f44937d.getDialogTypeFace() != null) {
                    if (s84.this.f44937d.getDialogTypeFaceStyle() != -99) {
                        this.f44953w.setTypeface(s84.this.f44937d.getDialogTypeFace(), s84.this.f44937d.getDialogTypeFaceStyle());
                        this.f44952v.setTypeface(s84.this.f44937d.getDialogTypeFace(), s84.this.f44937d.getDialogTypeFaceStyle());
                    } else {
                        this.f44953w.setTypeface(s84.this.f44937d.getDialogTypeFace());
                        this.f44952v.setTypeface(s84.this.f44937d.getDialogTypeFace());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: O */
        public RelativeLayout m47988O() {
            return this.f44951u;
        }

        /* renamed from: P */
        public void m47989P(C11556a c11556a) {
            if (c11556a == null) {
                this.f44956z.setVisibility(0);
                this.f44952v.setVisibility(8);
                this.f44953w.setVisibility(8);
                this.f44955y.setVisibility(8);
                return;
            }
            this.f44956z.setVisibility(8);
            this.f44952v.setVisibility(0);
            this.f44953w.setVisibility(0);
            if (s84.this.f44937d.m15829q()) {
                this.f44953w.setVisibility(0);
            } else {
                this.f44953w.setVisibility(8);
            }
            String str = "";
            if (s84.this.f44937d.getCcpDialogShowFlag() && s84.this.f44937d.F0) {
                str = "" + C11556a.m15852t(c11556a) + "   ";
            }
            String str2 = str + c11556a.m15867y();
            if (s84.this.f44937d.getCcpDialogShowNameCode()) {
                str2 = str2 + " (" + c11556a.m15868z().toUpperCase(Locale.US) + ")";
            }
            this.f44952v.setText(str2);
            this.f44953w.setText("+" + c11556a.m15856B());
            if (!s84.this.f44937d.getCcpDialogShowFlag() || s84.this.f44937d.F0) {
                this.f44955y.setVisibility(8);
            } else {
                this.f44955y.setVisibility(0);
                this.f44954x.setImageResource(c11556a.m15866u());
            }
        }
    }

    public s84(Context context, List list, CountryCodePicker countryCodePicker, RelativeLayout relativeLayout, EditText editText, TextView textView, Dialog dialog, ImageView imageView) {
        this.f44934a = null;
        this.f44941h = context;
        this.f44935b = list;
        this.f44937d = countryCodePicker;
        this.f44940g = dialog;
        this.f44936c = textView;
        this.f44939f = editText;
        this.f44942i = relativeLayout;
        this.f44943j = imageView;
        this.f44938e = LayoutInflater.from(context);
        this.f44934a = m47982f("");
        m47986j();
    }

    @Override // p001o.vaf
    /* renamed from: b */
    public String mo47980b(int i) {
        C11556a c11556a = (C11556a) this.f44934a.get(i);
        return this.f44944k > i ? "★" : c11556a != null ? c11556a.m15867y().substring(0, 1) : "☺";
    }

    /* renamed from: e */
    public final void m47981e(String str) {
        this.f44936c.setVisibility(8);
        String lowerCase = str.toLowerCase();
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '+') {
            lowerCase = lowerCase.substring(1);
        }
        List listM47982f = m47982f(lowerCase);
        this.f44934a = listM47982f;
        if (listM47982f.size() == 0) {
            this.f44936c.setVisibility(0);
        }
        notifyDataSetChanged();
    }

    /* renamed from: f */
    public final List m47982f(String str) {
        ArrayList arrayList = new ArrayList();
        this.f44944k = 0;
        List list = this.f44937d.P0;
        if (list != null && list.size() > 0) {
            for (C11556a c11556a : this.f44937d.P0) {
                if (c11556a.m15857D(str)) {
                    arrayList.add(c11556a);
                    this.f44944k++;
                }
            }
            if (arrayList.size() > 0) {
                arrayList.add(null);
                this.f44944k++;
            }
        }
        for (C11556a c11556a2 : this.f44935b) {
            if (c11556a2.m15857D(str)) {
                arrayList.add(c11556a2);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C16778e c16778e, int i) {
        c16778e.m47989P((C11556a) this.f44934a.get(i));
        if (this.f44934a.size() <= i || this.f44934a.get(i) == null) {
            c16778e.m47988O().setOnClickListener(null);
        } else {
            c16778e.m47988O().setOnClickListener(new ViewOnClickListenerC16777d(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    public int getItemCount() {
        return this.f44934a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2371h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C16778e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C16778e(this.f44938e.inflate(o9e.layout_recycler_country_tile, viewGroup, false));
    }

    /* renamed from: i */
    public final void m47985i() {
        this.f44943j.setOnClickListener(new ViewOnClickListenerC16774a());
    }

    /* renamed from: j */
    public final void m47986j() {
        if (!this.f44937d.m15832t()) {
            this.f44942i.setVisibility(8);
            return;
        }
        this.f44943j.setVisibility(8);
        m47987k();
        m47985i();
    }

    /* renamed from: k */
    public final void m47987k() {
        EditText editText = this.f44939f;
        if (editText != null) {
            editText.addTextChangedListener(new C16775b());
            this.f44939f.setOnEditorActionListener(new C16776c());
        }
    }
}
