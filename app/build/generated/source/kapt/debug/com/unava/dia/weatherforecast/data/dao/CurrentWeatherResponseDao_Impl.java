package com.unava.dia.weatherforecast.data.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.unava.dia.weatherforecast.data.model.curernt.Current;
import com.unava.dia.weatherforecast.data.model.curernt.CurrentWeatherResponse;
import com.unava.dia.weatherforecast.data.model.curernt.Location;
import com.unava.dia.weatherforecast.utils.WeatherConverter;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherResponseDao_Impl implements CurrentWeatherResponseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrentWeatherResponse> __insertionAdapterOfCurrentWeatherResponse;

  private final WeatherConverter __weatherConverter = new WeatherConverter();

  private final EntityDeletionOrUpdateAdapter<CurrentWeatherResponse> __deletionAdapterOfCurrentWeatherResponse;

  private final EntityDeletionOrUpdateAdapter<CurrentWeatherResponse> __updateAdapterOfCurrentWeatherResponse;

  public CurrentWeatherResponseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrentWeatherResponse = new EntityInsertionAdapter<CurrentWeatherResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `currentWeather` (`id`,`location`,`current`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeatherResponse value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final String _tmp;
        _tmp = __weatherConverter.fromLocation(value.getLocation());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __weatherConverter.fromCurrent(value.getCurrent());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
      }
    };
    this.__deletionAdapterOfCurrentWeatherResponse = new EntityDeletionOrUpdateAdapter<CurrentWeatherResponse>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `currentWeather` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeatherResponse value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfCurrentWeatherResponse = new EntityDeletionOrUpdateAdapter<CurrentWeatherResponse>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `currentWeather` SET `id` = ?,`location` = ?,`current` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeatherResponse value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        final String _tmp;
        _tmp = __weatherConverter.fromLocation(value.getLocation());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __weatherConverter.fromCurrent(value.getCurrent());
        if (_tmp_1 == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, _tmp_1);
        }
        if (value.getId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getId());
        }
      }
    };
  }

  @Override
  public Object insert(final CurrentWeatherResponse weather,
      final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfCurrentWeatherResponse.insertAndReturnId(weather);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final CurrentWeatherResponse weather,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCurrentWeatherResponse.handle(weather);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final CurrentWeatherResponse weather,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCurrentWeatherResponse.handle(weather);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public List<CurrentWeatherResponse> getCurrentWeatherList() {
    final String _sql = "SELECT * from currentWeather";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final int _cursorIndexOfCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "current");
      final List<CurrentWeatherResponse> _result = new ArrayList<CurrentWeatherResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final CurrentWeatherResponse _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final Location _tmpLocation;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfLocation)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfLocation);
        }
        _tmpLocation = __weatherConverter.toLocation(_tmp);
        final Current _tmpCurrent;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCurrent)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfCurrent);
        }
        _tmpCurrent = __weatherConverter.toCurrent(_tmp_1);
        _item = new CurrentWeatherResponse(_tmpId,_tmpLocation,_tmpCurrent);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public CurrentWeatherResponse getCurrentWeather(final long id) {
    final String _sql = "SELECT * FROM currentWeather WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfLocation = CursorUtil.getColumnIndexOrThrow(_cursor, "location");
      final int _cursorIndexOfCurrent = CursorUtil.getColumnIndexOrThrow(_cursor, "current");
      final CurrentWeatherResponse _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final Location _tmpLocation;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfLocation)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfLocation);
        }
        _tmpLocation = __weatherConverter.toLocation(_tmp);
        final Current _tmpCurrent;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfCurrent)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfCurrent);
        }
        _tmpCurrent = __weatherConverter.toCurrent(_tmp_1);
        _result = new CurrentWeatherResponse(_tmpId,_tmpLocation,_tmpCurrent);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
