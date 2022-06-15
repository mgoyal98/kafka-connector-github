package com.mgoyal.kafka;

import org.junit.Test;

public class GithubSourceConnectorConfigTest {
  @Test
  public void doc() {
    System.out.println(GithubSourceConnectorConfig.conf().toRst());
  }
}