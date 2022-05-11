package com.unava.dia.weatherforecast.data.api;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.CurrentWeatherResponseDao_Impl;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao;
import com.unava.dia.weatherforecast.data.dao.FutureWeatherResponseDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CurrentWeatherResponseDao _currentWeatherResponseDao;

  private volatile FutureWeatherResponseDao _futureWeatherResponseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `currentWeather` (`id` INTEGER, `location` TEXT, `current` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `futureWeather` (`id` INTEGER, `location` TEXT, `current` TEXT, `forecast` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bd78bce3864fdb60423a3341465d7fdc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `currentWeather`");
        _db.execSQL("DROP TABLE IF EXISTS `futureWeather`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrentWeather = new HashMap<String, TableInfo.Column>(3);
        _columnsCurrentWeather.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current", new TableInfo.Column("current", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeather = new TableInfo("currentWeather", _columnsCurrentWeather, _foreignKeysCurrentWeather, _indicesCurrentWeather);
        final TableInfo _existingCurrentWeather = TableInfo.read(_db, "currentWeather");
        if (! _infoCurrentWeather.equals(_existingCurrentWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "currentWeather(com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse).\n"
                  + " Expected:\n" + _infoCurrentWeather + "\n"
                  + " Found:\n" + _existingCurrentWeather);
        }
        final HashMap<String, TableInfo.Column> _columnsFutureWeather = new HashMap<String, TableInfo.Column>(4);
        _columnsFutureWeather.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("location", new TableInfo.Column("location", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("current", new TableInfo.Column("current", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFutureWeather.put("forecast", new TableInfo.Column("forecast", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFutureWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFutureWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFutureWeather = new TableInfo("futureWeather", _columnsFutureWeather, _foreignKeysFutureWeather, _indicesFutureWeather);
        final TableInfo _existingFutureWeather = TableInfo.read(_db, "futureWeather");
        if (! _infoFutureWeather.equals(_existingFutureWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "futureWeather(com.unava.dia.weatherforecast.data.model.future.FutureWeatherResponse).\n"
                  + " Expected:\n" + _infoFutureWeather + "\n"
                  + " Found:\n" + _existingFutureWeather);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "bd78bce3864fdb60423a3341465d7fdc", "f8ea430c172ac7abed8ee7f62ea47e9a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "currentWeather","futureWeather");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `currentWeather`");
      _db.execSQL("DELETE FROM `futureWeather`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentWeatherResponseDao.class, CurrentWeatherResponseDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(FutureWeatherResponseDao.class, FutureWeatherResponseDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  protected Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  protected List<Migration> getAutoMigrations() {
    return Arrays.asList();
  }

  @Override
  public CurrentWeatherResponseDao currentWeatherDao() {
    if (_currentWeatherResponseDao != null) {
      return _currentWeatherResponseDao;
    } else {
      synchronized(this) {
        if(_currentWeatherResponseDao == null) {
          _currentWeatherResponseDao = new CurrentWeatherResponseDao_Impl(this);
        }
        return _currentWeatherResponseDao;
      }
    }
  }

  @Override
  public FutureWeatherResponseDao futureWeatherDao() {
    if (_futureWeatherResponseDao != null) {
      return _futureWeatherResponseDao;
    } else {
      synchronized(this) {
        if(_futureWeatherResponseDao == null) {
          _futureWeatherResponseDao = new FutureWeatherResponseDao_Impl(this);
        }
        return _futureWeatherResponseDao;
      }
    }
  }
}
