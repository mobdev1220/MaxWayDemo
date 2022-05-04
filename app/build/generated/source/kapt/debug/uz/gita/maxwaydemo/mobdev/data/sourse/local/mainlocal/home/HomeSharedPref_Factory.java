// Generated by Dagger (https://dagger.dev).
package uz.gita.maxwaydemo.mobdev.data.sourse.local.mainlocal.home;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeSharedPref_Factory implements Factory<HomeSharedPref> {
  private final Provider<Context> contextProvider;

  public HomeSharedPref_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public HomeSharedPref get() {
    return newInstance(contextProvider.get());
  }

  public static HomeSharedPref_Factory create(Provider<Context> contextProvider) {
    return new HomeSharedPref_Factory(contextProvider);
  }

  public static HomeSharedPref newInstance(Context context) {
    return new HomeSharedPref(context);
  }
}