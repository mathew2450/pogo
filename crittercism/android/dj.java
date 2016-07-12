package crittercism.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import org.json.JSONException;
import org.json.JSONObject;

public final class dj extends di {
    private cw f733a;
    private dc f734b;
    private boolean f735c;
    private cy f736d;

    public dj(cw cwVar, dc dcVar, cy cyVar) {
        this(cwVar, dcVar, false, cyVar);
    }

    public dj(cw cwVar, dc dcVar, boolean z, cy cyVar) {
        this.f733a = cwVar;
        this.f734b = dcVar;
        this.f735c = z;
        this.f736d = cyVar;
    }

    public final void m711a() {
        boolean z;
        int i;
        int i2;
        UnsupportedEncodingException unsupportedEncodingException;
        SocketTimeoutException e;
        IOException iOException;
        JSONException jSONException;
        JSONObject jSONObject = null;
        try {
            URLConnection a = this.f734b.m696a();
            if (a != null) {
                try {
                    this.f733a.m676a(a.getOutputStream());
                    int responseCode = a.getResponseCode();
                    try {
                        JSONObject jSONObject2;
                        if (this.f735c) {
                            StringBuilder stringBuilder = new StringBuilder();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.getInputStream()));
                            while (true) {
                                int read = bufferedReader.read();
                                if (read == -1) {
                                    break;
                                }
                                stringBuilder.append((char) read);
                            }
                            bufferedReader.close();
                            jSONObject2 = new JSONObject(stringBuilder.toString());
                        } else {
                            jSONObject2 = null;
                        }
                        jSONObject = jSONObject2;
                        z = false;
                        i = responseCode;
                    } catch (UnsupportedEncodingException e2) {
                        UnsupportedEncodingException unsupportedEncodingException2 = e2;
                        i2 = responseCode;
                        unsupportedEncodingException = unsupportedEncodingException2;
                        new StringBuilder("UnsupportedEncodingException in proceed(): ").append(unsupportedEncodingException.getMessage());
                        dx.m753b();
                        dx.m756c();
                        i = i2;
                        z = false;
                        a.disconnect();
                        if (this.f736d != null) {
                            this.f736d.m682a(z, i, jSONObject);
                        }
                    } catch (SocketTimeoutException e3) {
                        e = e3;
                        i = responseCode;
                        new StringBuilder("SocketTimeoutException in proceed(): ").append(e.getMessage());
                        dx.m753b();
                        z = true;
                        a.disconnect();
                        if (this.f736d != null) {
                            this.f736d.m682a(z, i, jSONObject);
                        }
                    } catch (IOException e4) {
                        IOException iOException2 = e4;
                        i2 = responseCode;
                        iOException = iOException2;
                        new StringBuilder("IOException in proceed(): ").append(iOException.getMessage());
                        dx.m753b();
                        dx.m756c();
                        i = i2;
                        z = false;
                        a.disconnect();
                        if (this.f736d != null) {
                            this.f736d.m682a(z, i, jSONObject);
                        }
                    } catch (JSONException e5) {
                        JSONException jSONException2 = e5;
                        i2 = responseCode;
                        jSONException = jSONException2;
                        new StringBuilder("JSONException in proceed(): ").append(jSONException.getMessage());
                        dx.m753b();
                        i = i2;
                        z = false;
                        dx.m756c();
                        a.disconnect();
                        if (this.f736d != null) {
                            this.f736d.m682a(z, i, jSONObject);
                        }
                    }
                } catch (UnsupportedEncodingException e22) {
                    unsupportedEncodingException = e22;
                    i2 = -1;
                    new StringBuilder("UnsupportedEncodingException in proceed(): ").append(unsupportedEncodingException.getMessage());
                    dx.m753b();
                    dx.m756c();
                    i = i2;
                    z = false;
                    a.disconnect();
                    if (this.f736d != null) {
                        this.f736d.m682a(z, i, jSONObject);
                    }
                } catch (SocketTimeoutException e6) {
                    e = e6;
                    i = -1;
                    new StringBuilder("SocketTimeoutException in proceed(): ").append(e.getMessage());
                    dx.m753b();
                    z = true;
                    a.disconnect();
                    if (this.f736d != null) {
                        this.f736d.m682a(z, i, jSONObject);
                    }
                } catch (IOException e42) {
                    iOException = e42;
                    i2 = -1;
                    new StringBuilder("IOException in proceed(): ").append(iOException.getMessage());
                    dx.m753b();
                    dx.m756c();
                    i = i2;
                    z = false;
                    a.disconnect();
                    if (this.f736d != null) {
                        this.f736d.m682a(z, i, jSONObject);
                    }
                } catch (JSONException e52) {
                    jSONException = e52;
                    i2 = -1;
                    new StringBuilder("JSONException in proceed(): ").append(jSONException.getMessage());
                    dx.m753b();
                    i = i2;
                    z = false;
                    dx.m756c();
                    a.disconnect();
                    if (this.f736d != null) {
                        this.f736d.m682a(z, i, jSONObject);
                    }
                }
                a.disconnect();
                if (this.f736d != null) {
                    this.f736d.m682a(z, i, jSONObject);
                }
            }
        } catch (IOException e7) {
        } catch (GeneralSecurityException e8) {
        }
    }
}
