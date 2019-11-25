package com.briup.cms.service;

import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

public interface ILinkService {
    void saveOrUpdateLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link queryById(int id) throws CustomerException;
}
