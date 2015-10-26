package zsdn.topics;

import jmf.data.MessageType;
import jmf.data.builder.MessageTypeBuilder;

/**
 * Autogenerated Code. Changes here will be automatically overwritten.
 *
 * @author Andre Kutzleb
 */
public class LinkDiscoveryModuleTopics {

private static final byte  TOPIC_VAL__FROM = (byte)0x02L;
private static final short TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE = (short)0x0005L;
private static final byte  TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE__SWITCH_LINK_EVENT = (byte)0x00L;
private static final byte  TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE__SWITCH_LINK_EVENT__ADDED = (byte)0x00L;
private static final byte  TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE__SWITCH_LINK_EVENT__REMOVED = (byte)0x01L;
private static final byte  TOPIC_VAL__REQUEST = (byte)0x03L;
private static final short TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE = (short)0x0005L;
private static final byte  TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_ALL_SWITCH_LINKS = (byte)0x00L;
private static final byte  TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_LINKS_FROM_SWITCH = (byte)0x01L;
private static final byte  TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_LINKS_TO_SWITCH = (byte)0x02L;
private static final byte  TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_ALL_LINKS_OF_SWITCH = (byte)0x03L;
private static final byte  TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_LINKS_BETWEEN_TWO_SWITCHES = (byte)0x04L;
private static final byte  TOPIC_VAL__REPLY = (byte)0x04L;
private static final short TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE = (short)0x0005L;
private static final byte  TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_ALL_SWITCH_LINKS = (byte)0x00L;
private static final byte  TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_LINKS_FROM_SWITCH = (byte)0x01L;
private static final byte  TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_LINKS_TO_SWITCH = (byte)0x02L;
private static final byte  TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_ALL_LINKS_OF_SWITCH = (byte)0x03L;
private static final byte  TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_LINKS_BETWEEN_TWO_SWITCHES = (byte)0x04L;

public static class FROM {
private final MessageTypeBuilder id;
public class LINK_DISCOVERY_MODULE {
public class SWITCH_LINK_EVENT {
public class ADDED {
private ADDED() {id.appendMatch8((byte) TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE__SWITCH_LINK_EVENT__ADDED); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class REMOVED {
private REMOVED() {id.appendMatch8((byte) TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE__SWITCH_LINK_EVENT__REMOVED); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private SWITCH_LINK_EVENT() {id.appendMatch8((byte) TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE__SWITCH_LINK_EVENT); }
public ADDED added() {return new ADDED();}
public REMOVED removed() {return new REMOVED();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private LINK_DISCOVERY_MODULE() {id.appendMatch16((short) TOPIC_VAL__FROM__LINK_DISCOVERY_MODULE); }
public SWITCH_LINK_EVENT switch_link_event() {return new SWITCH_LINK_EVENT();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public FROM() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__FROM); }
public FROM(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__FROM); }
public LINK_DISCOVERY_MODULE link_discovery_module() {return new LINK_DISCOVERY_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public static class REQUEST {
private final MessageTypeBuilder id;
public class LINK_DISCOVERY_MODULE {
public class GET_ALL_SWITCH_LINKS {
private GET_ALL_SWITCH_LINKS() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_ALL_SWITCH_LINKS); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_LINKS_FROM_SWITCH {
private GET_LINKS_FROM_SWITCH() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_LINKS_FROM_SWITCH); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_LINKS_TO_SWITCH {
private GET_LINKS_TO_SWITCH() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_LINKS_TO_SWITCH); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_ALL_LINKS_OF_SWITCH {
private GET_ALL_LINKS_OF_SWITCH() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_ALL_LINKS_OF_SWITCH); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_LINKS_BETWEEN_TWO_SWITCHES {
private GET_LINKS_BETWEEN_TWO_SWITCHES() {id.appendMatch8((byte) TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE__GET_LINKS_BETWEEN_TWO_SWITCHES); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private LINK_DISCOVERY_MODULE() {id.appendMatch16((short) TOPIC_VAL__REQUEST__LINK_DISCOVERY_MODULE); }
public GET_ALL_SWITCH_LINKS get_all_switch_links() {return new GET_ALL_SWITCH_LINKS();}
public GET_LINKS_FROM_SWITCH get_links_from_switch() {return new GET_LINKS_FROM_SWITCH();}
public GET_LINKS_TO_SWITCH get_links_to_switch() {return new GET_LINKS_TO_SWITCH();}
public GET_ALL_LINKS_OF_SWITCH get_all_links_of_switch() {return new GET_ALL_LINKS_OF_SWITCH();}
public GET_LINKS_BETWEEN_TWO_SWITCHES get_links_between_two_switches() {return new GET_LINKS_BETWEEN_TWO_SWITCHES();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public REQUEST() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__REQUEST); }
public REQUEST(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__REQUEST); }
public LINK_DISCOVERY_MODULE link_discovery_module() {return new LINK_DISCOVERY_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public static class REPLY {
private final MessageTypeBuilder id;
public class LINK_DISCOVERY_MODULE {
public class GET_ALL_SWITCH_LINKS {
private GET_ALL_SWITCH_LINKS() {id.appendMatch8((byte) TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_ALL_SWITCH_LINKS); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_LINKS_FROM_SWITCH {
private GET_LINKS_FROM_SWITCH() {id.appendMatch8((byte) TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_LINKS_FROM_SWITCH); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_LINKS_TO_SWITCH {
private GET_LINKS_TO_SWITCH() {id.appendMatch8((byte) TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_LINKS_TO_SWITCH); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_ALL_LINKS_OF_SWITCH {
private GET_ALL_LINKS_OF_SWITCH() {id.appendMatch8((byte) TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_ALL_LINKS_OF_SWITCH); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public class GET_LINKS_BETWEEN_TWO_SWITCHES {
private GET_LINKS_BETWEEN_TWO_SWITCHES() {id.appendMatch8((byte) TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE__GET_LINKS_BETWEEN_TWO_SWITCHES); }
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

private LINK_DISCOVERY_MODULE() {id.appendMatch16((short) TOPIC_VAL__REPLY__LINK_DISCOVERY_MODULE); }
public GET_ALL_SWITCH_LINKS get_all_switch_links() {return new GET_ALL_SWITCH_LINKS();}
public GET_LINKS_FROM_SWITCH get_links_from_switch() {return new GET_LINKS_FROM_SWITCH();}
public GET_LINKS_TO_SWITCH get_links_to_switch() {return new GET_LINKS_TO_SWITCH();}
public GET_ALL_LINKS_OF_SWITCH get_all_links_of_switch() {return new GET_ALL_LINKS_OF_SWITCH();}
public GET_LINKS_BETWEEN_TWO_SWITCHES get_links_between_two_switches() {return new GET_LINKS_BETWEEN_TWO_SWITCHES();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

public REPLY() {id = new MessageTypeBuilder(); id.appendMatch8((byte) TOPIC_VAL__REPLY); }
public REPLY(MessageTypeBuilder preallocatedBuilder) {id = preallocatedBuilder; id.appendMatch8((byte) TOPIC_VAL__REPLY); }
public LINK_DISCOVERY_MODULE link_discovery_module() {return new LINK_DISCOVERY_MODULE();}
public MessageType build() {return id.build();}
public MessageTypeBuilder getBuilderBack() {return id;}
};

};
