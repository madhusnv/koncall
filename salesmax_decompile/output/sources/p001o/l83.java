package p001o;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class l83 {

    /* renamed from: a */
    public static final l83 f33431a = new l83();

    /* renamed from: a */
    public final String m36735a(Context context, double d, double d2) throws IOException {
        sq8.m48649h(context, "<this>");
        try {
            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(d, d2, 1);
            if (fromLocation == null || fromLocation.size() <= 0) {
                return "";
            }
            int i = 0;
            Address address = fromLocation.get(0);
            StringBuilder sb = new StringBuilder("");
            int maxAddressLineIndex = address.getMaxAddressLineIndex();
            if (maxAddressLineIndex >= 0) {
                while (true) {
                    sb.append(address.getAddressLine(i));
                    sb.append("\n");
                    if (i == maxAddressLineIndex) {
                        break;
                    }
                    i++;
                }
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            return string;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
