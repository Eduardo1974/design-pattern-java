package com.pattern.example.demo.behavioral.iterator.src.example1;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    private ChannelTypeEnum type;
    private List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum ty,
                               List<Channel> channelsList) {
        this.type = ty;
        this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (position < channels.size()) {
            Channel c = channels.get(position);
            if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                return true;
            } else
                position++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel c = channels.get(position);
        position++;
        return c;
    }

}