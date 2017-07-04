/**
 * Copyright 2017 EIS Co., Ltd. All rights reserved.
 */

package com.omsb.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.omsb.common.entity.UserEntity;
import com.omsb.common.repository.UserRepository;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
@Component
public class UserService implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  /*
   * (非 Javadoc)
   * @see
   * org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.
   * String)
   */
  @Override
  public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException {
    if ( StringUtils.isEmpty( username ) ) {
      throw new UsernameNotFoundException( "" );
    }

    UserEntity userEntity = userRepository.findByUsername( username );
    if ( userEntity == null ) {
      throw new UsernameNotFoundException( "" );
    }

    return userEntity;
  }

}
