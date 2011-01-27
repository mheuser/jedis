package com.googlecode.jedis;

import static com.google.common.base.Charsets.UTF_8;

import java.nio.charset.Charset;

final class Protocol {

    protected static enum Command {
	APPEND, AUTH, BGREWRITEAOF, BGSAVE, BLPOP, BRPOP, CONFIG, DBSIZE,
	DEBUG, DECR, DECRBY, DEL, DISCARD, ECHO, EXEC, EXISTS, EXPIRE,
	EXPIREAT, FLUSHALL, FLUSHDB, GET, GETSET, HDEL, HEXISTS, HGET, HGETALL,
	HINCRBY, HKEYS, HLEN, HMGET, HMSET, HSET, HSETNX, HVALS, INCR, INCRBY,
	INFO, KEYS, LASTSAVE, LINDEX, LINSERT, LLEN, LPOP, LPUSH, LPUSHX,
	LRANGE, LREM, LSET, LTRIM, MGET, MONITOR, MOVE, MSET, MSETNX, MULTI,
	PERSIST, PING, PSUBSCRIBE, PUBLISH, PUNSUBSCRIBE, QUIT, RANDOMKEY,
	RENAME, RENAMENX, RENAMEX, RPOP, RPOPLPUSH, RPUSH, RPUSHX, SADD, SAVE,
	SCARD, SDIFF, SDIFFSTORE, SELECT, SET, SETEX, SETNX, SHUTDOWN, SINTER,
	SINTERSTORE, SISMEMBER, SLAVEOF, SMEMBERS, SMOVE, SORT, SPOP,
	SRANDMEMBER, SREM, STRLEN, SUBSCRIBE, SUBSTR, SUNION, SUNIONSTORE,
	SYNC, TTL, TYPE, UNSUBSCRIBE, UNWATCH, WATCH, ZADD, ZCARD, ZCOUNT,
	ZINCRBY, ZINTERSTORE, ZRANGE, ZRANGEBYSCORE, ZRANK, ZREM,
	ZREMRANGEBYRANK, ZREMRANGEBYSCORE, ZREVRANGE, ZREVRANGEBYSCORE,
	ZREVRANK, ZSCORE, ZUNIONSTORE;

	protected final byte[] raw;

	Command() {
	    raw = name().getBytes(UTF_8);
	}
    }

    protected static enum Keyword {
	AGGREGATE, ALPHA, ASC, BY, DESC, GET, LIMIT, MESSAGE, NO, NOSORT,
	OBJECT, OK, ONE, PMESSAGE, PONG, PSUBSCRIBE, PUNSUBSCRIBE, QUEUED,
	RELOAD, SEGFAULT, SET, STORE, SUBSCRIBE, SWAPIN, SWAPOUT, UNSUBSCRIBE,
	WEIGHTS, WITHSCORES;
	protected final byte[] raw;

	Keyword() {
	    raw = name().getBytes(UTF_8);
	}
    }

    protected static final Charset DEFAULT_CHARSET = UTF_8;
    protected static final String DEFAULT_HOST = "localhost";
    protected static final String DEFAULT_PASSWORD = null;
    protected static final int DEFAULT_PORT = 6379;
    protected static final int DEFAULT_TIMEOUT = 15 * 1000; // in millis
}