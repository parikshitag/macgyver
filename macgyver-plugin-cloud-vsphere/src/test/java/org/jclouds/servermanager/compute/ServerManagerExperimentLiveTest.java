/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.servermanager.compute;

import io.macgyver.jclouds.vsphere.ServerManagerApiMetadata;

import java.util.Properties;
import java.util.Set;

import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.compute.domain.ComputeMetadata;

public class ServerManagerExperimentLiveTest  {

   public ServerManagerExperimentLiveTest() {
    //  provider = "servermanager";
   }

   @org.junit.Test
   public void testAndExperiment() {
      ComputeServiceContext context = null;
      try {
    	  
    	
         context = ContextBuilder.newBuilder(new ServerManagerApiMetadata().toBuilder().credentialName("abc").build()).credentials("abc", "def").overrides(new Properties()).build(ComputeServiceContext.class);
 
     
         for (ComputeMetadata md : context.getComputeService().listNodes()) {
        	 System.out.println(">>"+md);
         }


      } finally {
         if (context != null)
            context.close();
      }
   }

}