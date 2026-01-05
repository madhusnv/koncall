package p001o;

import ai.salesmax.model.FormField;
import ai.salesmax.model.FormFields;
import ai.salesmax.model.PropertyDefinition;
import ai.salesmax.model.event.ItemChangeEvent;
import ai.salesmax.model.event.ItemChangeListener;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.android.gms.common.util.GmsVersion;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.timepicker.MaterialTimePicker;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p001o.ck6;

/* loaded from: classes.dex */
public abstract class ce4 {

    /* renamed from: o.ce4$a */
    public static final class C12648a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ FormField f17983a;

        /* renamed from: b */
        public final /* synthetic */ Button f17984b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12648a(FormField formField, Button button) {
            super(1);
            this.f17983a = formField;
            this.f17984b = button;
        }

        /* renamed from: a */
        public final void m21056a(Long l) {
            sq8.m48646e(l);
            long jM34034T = jm7.m34034T(l.longValue());
            this.f17983a.setSubmittedPropertyValue(a81.m16653h(Long.valueOf(jM34034T)));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yy");
            Date date = new Date(jM34034T);
            Button button = this.f17984b;
            if (button != null) {
                button.setText(simpleDateFormat.format(date).toString());
            }
            ce4.m21054q(this.f17984b, this.f17983a, Long.valueOf(jM34034T));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m21056a((Long) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.ce4$b */
    public static final class C12649b extends iuf {

        /* renamed from: g */
        public final /* synthetic */ gge f17985g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12649b(gge ggeVar, C12650c c12650c) {
            super(c12650c, null, false, null, 14, null);
            this.f17985g = ggeVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            if (r4.equals("website") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (r4.equals("email") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
        
            if (r4.equals("text") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        
            if (r4.equals(com.google.android.gms.common.internal.ImagesContract.URL) == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        
            if (r4.equals("phonenumber") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        
            if (r4.equals("option") != false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        
            if (r4.equals("number") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
        
            return p001o.p9e.item_custom_form_textinput;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
        
            if (r4.equals("selection") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
        
            return p001o.p9e.item_custom_form_selection;
         */
        @Override // p001o.wqb
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo705f(int i) {
            String scalarType;
            String str;
            PropertyDefinition propertyDefinition = ((FormField) ((List) ((AtomicReference) this.f17985g.f25106a).get()).get(i)).getPropertyDefinition();
            if (propertyDefinition == null || (scalarType = propertyDefinition.getScalarType()) == null) {
                scalarType = "text";
            }
            Locale locale = Locale.getDefault();
            sq8.m48648g(locale, "getDefault(...)");
            String lowerCase = scalarType.toLowerCase(locale);
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1715965556:
                    break;
                case -1430886566:
                    if (lowerCase.equals("multilinetext")) {
                        return p9e.item_custom_form_textarea;
                    }
                    return p9e.item_custom_form_textinput;
                case -1413853096:
                    str = "amount";
                    lowerCase.equals(str);
                    return p9e.item_custom_form_textinput;
                case -1034364087:
                    break;
                case -1010136971:
                    break;
                case -276836809:
                    break;
                case 116079:
                    break;
                case 3143036:
                    str = TransferTable.COLUMN_FILE;
                    lowerCase.equals(str);
                    return p9e.item_custom_form_textinput;
                case 3556653:
                    break;
                case 64711720:
                    str = "boolean";
                    lowerCase.equals(str);
                    return p9e.item_custom_form_textinput;
                case 96619420:
                    break;
                case 1224335515:
                    break;
                case 1793702779:
                    if (lowerCase.equals("datetime")) {
                        return p9e.item_custom_form_datetime;
                    }
                    return p9e.item_custom_form_textinput;
                case 1901043637:
                    str = "location";
                    lowerCase.equals(str);
                    return p9e.item_custom_form_textinput;
                default:
                    return p9e.item_custom_form_textinput;
            }
        }

        @Override // p001o.wqb
        /* renamed from: g */
        public Object mo706g(int i) {
            return ((List) ((AtomicReference) this.f17985g.f25106a).get()).get(i);
        }

        @Override // p001o.wqb, androidx.recyclerview.widget.RecyclerView.AbstractC2371h
        public int getItemCount() {
            String.valueOf(((List) ((AtomicReference) this.f17985g.f25106a).get()).size());
            return ((List) ((AtomicReference) this.f17985g.f25106a).get()).size();
        }
    }

    /* renamed from: o.ce4$c */
    public static final class C12650c implements ck6 {
        @Override // p001o.ck6
        /* renamed from: a */
        public boolean mo707a(View view, int i, Object obj) {
            return ck6.C12696a.m21336b(this, view, i, obj);
        }

        @Override // p001o.ck6
        /* renamed from: b */
        public void mo708b(View view, int i, Object obj) {
            sq8.m48649h(view, "view");
            if (obj instanceof FormField) {
                int id = view.getId();
                if (id == z8e.btnCustomDate) {
                    if (view instanceof Button) {
                        ce4.m21046i((Button) view, (FormField) obj);
                        return;
                    }
                    return;
                }
                if (id == z8e.btnLaterToday) {
                    ((FormField) obj).setSubmittedPropertyValue(a81.m16653h(Long.valueOf(System.currentTimeMillis() + GmsVersion.VERSION_PARMESAN)));
                    return;
                }
                if (id == z8e.btnTomorrow) {
                    Calendar calendar = Calendar.getInstance();
                    sq8.m48648g(calendar, "getInstance(...)");
                    calendar.add(6, 1);
                    calendar.set(11, 10);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    Date time = calendar.getTime();
                    sq8.m48648g(time, "getTime(...)");
                    ((FormField) obj).setSubmittedPropertyValue(a81.m16653h(Long.valueOf(time.getTime())));
                    return;
                }
                if (id == z8e.btnLaterThisWeek) {
                    Calendar calendar2 = Calendar.getInstance();
                    sq8.m48648g(calendar2, "getInstance(...)");
                    if (calendar2.get(7) >= 5) {
                        calendar2.add(3, 1);
                    }
                    calendar2.set(7, 5);
                    calendar2.set(11, 10);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    Date time2 = calendar2.getTime();
                    sq8.m48648g(time2, "getTime(...)");
                    ((FormField) obj).setSubmittedPropertyValue(a81.m16653h(Long.valueOf(time2.getTime())));
                    return;
                }
                if (id == z8e.btnNextWeek) {
                    Calendar calendar3 = Calendar.getInstance();
                    sq8.m48648g(calendar3, "getInstance(...)");
                    calendar3.add(6, 7);
                    calendar3.set(11, 10);
                    calendar3.set(12, 0);
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                    Date time3 = calendar3.getTime();
                    sq8.m48648g(time3, "getTime(...)");
                    ((FormField) obj).setSubmittedPropertyValue(a81.m16653h(Long.valueOf(time3.getTime())));
                }
            }
        }

        @Override // p001o.ck6
        /* renamed from: c */
        public void mo709c(EditText editText, Object obj) {
            String lowerCase;
            String scalarType;
            sq8.m48649h(editText, "view");
            if (obj instanceof FormField) {
                editText.getText().toString();
                FormField formField = (FormField) obj;
                PropertyDefinition propertyDefinition = formField.getPropertyDefinition();
                if (propertyDefinition == null || (scalarType = propertyDefinition.getScalarType()) == null) {
                    lowerCase = null;
                } else {
                    Locale locale = Locale.getDefault();
                    sq8.m48648g(locale, "getDefault(...)");
                    lowerCase = scalarType.toLowerCase(locale);
                    sq8.m48648g(lowerCase, "toLowerCase(...)");
                }
                if (!sq8.m48644c(lowerCase, "number")) {
                    formField.setSubmittedPropertyValue(editText.getText().toString());
                    return;
                }
                try {
                    Double dM20528j = c9g.m20528j(f9g.Z0(editText.getText().toString()).toString());
                    Integer numValueOf = dM20528j != null ? Integer.valueOf(lza.m38120c(dM20528j.doubleValue())) : null;
                    if (numValueOf != null) {
                        ((FormField) obj).setSubmittedPropertyValue(numValueOf);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: i */
    public static final void m21046i(Button button, FormField formField) {
        AppCompatActivity appCompatActivityM21051n = m21051n(button != null ? button.getContext() : null);
        if (appCompatActivityM21051n == null) {
            return;
        }
        MaterialDatePicker.C11029c c11029cM14503h = MaterialDatePicker.C11029c.m14496c().m14503h("Select date");
        sq8.m48648g(c11029cM14503h, "setTitleText(...)");
        MaterialDatePicker materialDatePickerM14499a = c11029cM14503h.m14499a();
        sq8.m48648g(materialDatePickerM14499a, "build(...)");
        materialDatePickerM14499a.show(appCompatActivityM21051n.getSupportFragmentManager(), "tag");
        final C12648a c12648a = new C12648a(formField, button);
        materialDatePickerM14499a.N0(new xya() { // from class: o.xd4
            @Override // p001o.xya
            /* renamed from: a */
            public final void mo17576a(Object obj) {
                ce4.m21047j(c12648a, obj);
            }
        });
        materialDatePickerM14499a.M0(new View.OnClickListener() { // from class: o.yd4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ce4.m21048k(view);
            }
        });
        materialDatePickerM14499a.K0(new DialogInterface.OnCancelListener() { // from class: o.zd4
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ce4.m21049l(dialogInterface);
            }
        });
        materialDatePickerM14499a.L0(new DialogInterface.OnDismissListener() { // from class: o.ae4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ce4.m21050m(dialogInterface);
            }
        });
    }

    /* renamed from: j */
    public static final void m21047j(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: k */
    public static final void m21048k(View view) {
    }

    /* renamed from: l */
    public static final void m21049l(DialogInterface dialogInterface) {
    }

    /* renamed from: m */
    public static final void m21050m(DialogInterface dialogInterface) {
    }

    /* renamed from: n */
    public static final AppCompatActivity m21051n(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        return null;
    }

    /* renamed from: o */
    public static final void m21052o(final RecyclerView recyclerView, FormFields formFields) {
        final gge ggeVar = new gge();
        List<FormField> listListAllFormField = formFields != null ? formFields.listAllFormField() : null;
        if (listListAllFormField == null) {
            listListAllFormField = ch3.m21246k();
        }
        ggeVar.f25106a = listListAllFormField;
        final gge ggeVar2 = new gge();
        ggeVar2.f25106a = new AtomicReference(ggeVar.f25106a);
        if (recyclerView != null) {
            recyclerView.setAdapter(new C12649b(ggeVar2, new C12650c()));
            if (formFields != null) {
                formFields.addListener(new ItemChangeListener() { // from class: o.wd4
                    @Override // ai.salesmax.model.event.ItemChangeListener
                    public final void onItemChanged(ItemChangeEvent itemChangeEvent) {
                        ce4.m21053p(ggeVar, ggeVar2, recyclerView, itemChangeEvent);
                    }
                });
            }
        }
    }

    /* renamed from: p */
    public static final void m21053p(gge ggeVar, gge ggeVar2, RecyclerView recyclerView, ItemChangeEvent itemChangeEvent) {
        sq8.m48649h(ggeVar, "$allFormField");
        sq8.m48649h(ggeVar2, "$allFormFieldReference");
        int size = ((List) itemChangeEvent.getOldItem()).size();
        int size2 = ((List) itemChangeEvent.getNewItem()).size();
        StringBuilder sb = new StringBuilder();
        sb.append(size);
        sb.append(" - ");
        sb.append(size2);
        if (Objects.equals(itemChangeEvent.getOldItem(), itemChangeEvent.getNewItem())) {
            return;
        }
        Object newItem = itemChangeEvent.getNewItem();
        sq8.m48648g(newItem, "getNewItem(...)");
        ggeVar.f25106a = newItem;
        ((AtomicReference) ggeVar2.f25106a).set(newItem);
        RecyclerView.AbstractC2371h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: q */
    public static final void m21054q(Button button, final FormField formField, final Long l) {
        MaterialTimePicker.C11165d c11165dM15516n = new MaterialTimePicker.C11165d().m15515m(0).m15513k(10).m15514l(30).m15516n("Select Task due time");
        sq8.m48648g(c11165dM15516n, "setTitleText(...)");
        AppCompatActivity appCompatActivityM21051n = m21051n(button != null ? button.getContext() : null);
        if (appCompatActivityM21051n == null) {
            return;
        }
        final MaterialTimePicker materialTimePickerM15512j = c11165dM15516n.m15512j();
        sq8.m48648g(materialTimePickerM15512j, "build(...)");
        materialTimePickerM15512j.show(appCompatActivityM21051n.getSupportFragmentManager(), "tag");
        materialTimePickerM15512j.S0(new View.OnClickListener() { // from class: o.be4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ce4.m21055r(materialTimePickerM15512j, l, formField, view);
            }
        });
    }

    /* renamed from: r */
    public static final void m21055r(MaterialTimePicker materialTimePicker, Long l, FormField formField, View view) {
        sq8.m48649h(materialTimePicker, "$picker");
        sq8.m48649h(formField, "$obj");
        long jU0 = (materialTimePicker.U0() * 60 * 60 * 1000) + (materialTimePicker.V0() * 60 * 1000);
        if (l != null) {
            formField.setSubmittedPropertyValue(a81.m16653h(Long.valueOf(l.longValue() + jU0)));
        }
    }
}
