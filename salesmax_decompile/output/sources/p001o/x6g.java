package p001o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class x6g extends lha {

    /* renamed from: d */
    public static final UriMatcher f53280d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f53280d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public x6g(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return InputStream.class;
    }

    @Override // p001o.lha
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo37219c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p001o.lha
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo37220f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM55749i = m55749i(uri, contentResolver);
        if (inputStreamM55749i != null) {
            return inputStreamM55749i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream m55749i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f53280d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m55750j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m55750j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream m55750j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
