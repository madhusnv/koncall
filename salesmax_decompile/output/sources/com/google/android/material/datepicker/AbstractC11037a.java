package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import org.apache.http.message.TokenParser;
import p001o.gqi;
import p001o.jjh;
import p001o.v9e;
import p001o.wz4;

/* renamed from: com.google.android.material.datepicker.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11037a extends jjh {

    /* renamed from: a */
    public final TextInputLayout f12511a;

    /* renamed from: b */
    public final String f12512b;

    /* renamed from: c */
    public final DateFormat f12513c;

    /* renamed from: d */
    public final CalendarConstraints f12514d;

    /* renamed from: e */
    public final String f12515e;

    /* renamed from: f */
    public final Runnable f12516f;

    /* renamed from: g */
    public Runnable f12517g;

    /* renamed from: h */
    public int f12518h = 0;

    public AbstractC11037a(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f12512b = str;
        this.f12513c = dateFormat;
        this.f12511a = textInputLayout;
        this.f12514d = calendarConstraints;
        this.f12515e = textInputLayout.getContext().getString(v9e.mtrl_picker_out_of_range);
        this.f12516f = new Runnable() { // from class: o.qz4
            @Override // java.lang.Runnable
            public final void run() {
                this.f42642a.m14544e(str);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m14543d(long j) {
        this.f12511a.setError(String.format(this.f12515e, m14547i(wz4.m55432c(j))));
        mo14529f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m14544e(String str) {
        TextInputLayout textInputLayout = this.f12511a;
        DateFormat dateFormat = this.f12513c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(v9e.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(v9e.mtrl_picker_invalid_format_use), m14547i(str)) + "\n" + String.format(context.getString(v9e.mtrl_picker_invalid_format_example), m14547i(dateFormat.format(new Date(gqi.m29325k().getTimeInMillis())))));
        mo14529f();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f12512b.length() && editable.length() >= this.f12518h) {
            char cCharAt = this.f12512b.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // p001o.jjh, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f12518h = charSequence.length();
    }

    /* renamed from: c */
    public final Runnable m14545c(final long j) {
        return new Runnable() { // from class: o.rz4
            @Override // java.lang.Runnable
            public final void run() {
                this.f44289a.m14543d(j);
            }
        };
    }

    /* renamed from: f */
    public abstract void mo14529f();

    /* renamed from: g */
    public abstract void mo14530g(Long l);

    /* renamed from: h */
    public void m14546h(View view, Runnable runnable) {
        view.post(runnable);
    }

    /* renamed from: i */
    public final String m14547i(String str) {
        return str.replace(TokenParser.SP, (char) 160);
    }

    @Override // p001o.jjh, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws ParseException {
        this.f12511a.removeCallbacks(this.f12516f);
        this.f12511a.removeCallbacks(this.f12517g);
        this.f12511a.setError(null);
        mo14530g(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f12512b.length()) {
            return;
        }
        try {
            Date date = this.f12513c.parse(charSequence.toString());
            this.f12511a.setError(null);
            long time = date.getTime();
            if (this.f12514d.m14452g().L0(time) && this.f12514d.m14459n(time)) {
                mo14530g(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableM14545c = m14545c(time);
            this.f12517g = runnableM14545c;
            m14546h(this.f12511a, runnableM14545c);
        } catch (ParseException unused) {
            m14546h(this.f12511a, this.f12516f);
        }
    }
}
