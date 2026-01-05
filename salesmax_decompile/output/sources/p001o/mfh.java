package p001o;

import ai.salesmax.model.TemplateTypes;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class mfh {

    /* renamed from: c */
    public static mfh f35362c;

    /* renamed from: a */
    public boolean f35363a;

    /* renamed from: b */
    public boolean f35364b;

    /* renamed from: b */
    public static mfh m38955b() {
        if (f35362c == null) {
            f35362c = new mfh();
        }
        return f35362c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Boolean m38956e(Boolean bool) {
        m38959f(bool.booleanValue());
        return Boolean.valueOf(this.f35363a);
    }

    /* renamed from: c */
    public List m38957c(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (this.f35363a && z2) {
            TemplateTypes templateTypes = new TemplateTypes();
            templateTypes.setValue("wabaTemplate");
            templateTypes.setViewValue("Whatsapp Templates");
            arrayList.add(templateTypes);
        }
        if (!z) {
            TemplateTypes templateTypes2 = new TemplateTypes();
            templateTypes2.setValue(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            templateTypes2.setViewValue(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
            templateTypes2.setSelected(true);
            arrayList.add(templateTypes2);
            TemplateTypes templateTypes3 = new TemplateTypes();
            templateTypes3.setValue("document");
            templateTypes3.setViewValue("document");
            arrayList.add(templateTypes3);
        }
        return arrayList;
    }

    /* renamed from: d */
    public x6c m38958d(u03 u03Var) {
        return (this.f35364b || u03Var == null) ? x6c.c0(Boolean.valueOf(this.f35363a)) : u03Var.bb().d0(new rl7() { // from class: o.lfh
            @Override // p001o.rl7
            public final Object apply(Object obj) {
                return this.f33738a.m38956e((Boolean) obj);
            }
        });
    }

    /* renamed from: f */
    public void m38959f(boolean z) {
        this.f35363a = z;
        this.f35364b = true;
    }
}
